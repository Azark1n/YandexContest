package InternSheep2022.D;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Task> tasksStart = new ArrayList<>();
    static ArrayList<Task> tasksEnd = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        String inputFileName = "src/InternSheep2022/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            int numTask = Integer.parseInt(input.readLine());
            for (int i = 0; i < numTask; i++) {
                String[] stringTasks = input.readLine().split(" ");
                Task task = new Task(Integer.parseInt(stringTasks[0]), Integer.parseInt(stringTasks[1]), Integer.parseInt(stringTasks[2]));
                tasksStart.add(task);
                tasksEnd.add(task);
            }

            tasksStart.sort((t1, t2) -> t1.start - t2.start);
            tasksEnd.sort((t1, t2) -> t1.end - t2.end);

            int numQuest = Integer.parseInt(input.readLine());
            for (int i = 0; i < numQuest; i++) {
                String[] stringQuests = input.readLine().split(" ");
                if (stringQuests[2].equals("1")){
                    int i1 = costTaskBegin(Integer.parseInt(stringQuests[0]), Integer.parseInt(stringQuests[1]));
//                    System.out.println(i1);
                    output.write(String.valueOf(i1));
                    output.write(" ");
                } else {
                    int i1 = lenTaskEnd(Integer.parseInt(stringQuests[0]), Integer.parseInt(stringQuests[1]));
//                    System.out.println(i2);
                    output.write(String.valueOf(i1));
                    output.write(" ");
                }
            }

        }
    }

    static int costTaskBegin(int start, int end) {
        int result = 0;
        for (Task task : tasksStart) {
            if (task.start >= start) {
                if (task.start <= end)
                    result += task.cost;
                else
                    break;
            }
        }
        return result;
    }

    static int lenTaskEnd(int start, int end) {
        int result = 0;
        for (Task task : tasksEnd) {
            if (task.end >= start) {
                if (task.end <= end)
                    result += task.end - task.start;
                else
                    break;
            }
        }
        return result;
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

}