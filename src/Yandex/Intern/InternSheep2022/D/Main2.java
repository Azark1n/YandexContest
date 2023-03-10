package Yandex.Intern.InternSheep2022.D;

import java.io.*;
import java.util.ArrayList;

public class Main2 {

    static ArrayList<Task> tasks = new ArrayList<>();
    static ArrayList<Quest> quests = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        String inputFileName = "src/YandexIntern.InternSheep2022/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            int numTask = Integer.parseInt(input.readLine());
            for (int i = 0; i < numTask; i++) {
                String[] stringTasks = input.readLine().split(" ");
                tasks.add(new Task(Integer.parseInt(stringTasks[0]), Integer.parseInt(stringTasks[1]), Integer.parseInt(stringTasks[2])));
            }

            int numQuest = Integer.parseInt(input.readLine());
            for (int i = 0; i < numQuest; i++) {
                String[] stringQuests = input.readLine().split(" ");
                quests.add(new Quest(Integer.parseInt(stringQuests[0]), Integer.parseInt(stringQuests[1]), Integer.parseInt(stringQuests[2])));
            }

            tasks.sort((t1, t2) -> t1.start - t2.start);
            quests.sort((q1, q2) -> {
                int type = q1.type - q2.type;
                if (type == 0){
                    return q1.start - q2.start;
                }
                return type;
            });

            boolean sorted = false;
            for (Quest quest : quests) {
                if (quest.type == 1) {
                    if (quest.start > tasks.get(tasks.size() - 1).start)
                        continue;
                    else
                        costTaskBegin(quest);
                } else {
                    if (!sorted)
                        tasks.sort((t1, t2) -> t1.end - t2.end);

                    if (quest.start > tasks.get(tasks.size() - 1).end)
                        break;
                    else
                        lenTaskEnd(quest);
                }
            }

            quests.sort((q1, q2) -> q1.id - q2.id);
            for (Quest quest : quests) {
                System.out.println(quest.result);
                output.write(String.valueOf(quest.result));
                output.write(" ");
            }
        }
    }

    static void costTaskBegin(Quest quest) {
        for (Task task : tasks) {
            if (task.start >= quest.start) {
                if (task.start <= quest.end)
                    quest.result += task.cost;
                else
                    break;
            }
        }
    }

    static void lenTaskEnd(Quest quest) {
        for (Task task : tasks) {
            if (task.end >= quest.start) {
                if (task.end <= quest.end)
                    quest.result += task.end - task.start;
                else
                    break;
            }
        }
    }

    static class Task {
        int start;
        int end;
        int cost;

        public Task(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }
    static class Quest {
        static int startId = 0;
        int id;
        int start;
        int end;
        int type;
        int result;

        public Quest(int start, int end, int type) {
            this.start = start;
            this.end = end;
            this.type = type;
            this.id = startId++;
        }
    }

}