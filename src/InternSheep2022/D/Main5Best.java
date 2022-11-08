package InternSheep2022.D;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main5Best {

    //Структуры для хранения:

    static ArrayList<Quest> quests = new ArrayList<>();

    //Карта накопительной стоимостей заказов на даты запросов. Ключ - дата. Значение - сумма
    static HashMap<Integer,Long> costTaskStartedAt = new HashMap<>();
    //Карта накопительной длительности заказов на даты запросов. Ключ - дата. Значение - сумма
    static HashMap<Integer,Long> lenTaskEndedAt = new HashMap<>();

    public static void main(String[] args) throws IOException {

        String inputFileName = "src/InternSheep2022/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try (BufferedReader input = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))) {

            //Заполнение tasks из input.txt
            int numTask = Integer.parseInt(input.readLine());
            for (int i = 0; i < numTask; i++) {
                //String[] stringTasks = input.readLine().split(" ");

                Matcher matcher = Pattern.compile("^(\\d+) +(\\d+) +(\\d+)$").matcher(input.readLine());
                if (!matcher.find()) {
                    System.out.println("Некорректный ввод!");
                    return;
                }

                Task task = new Task(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
                costTaskStartedAt.put(task.start, costTaskStartedAt.getOrDefault(task.start, 0L) + task.cost);
                lenTaskEndedAt.put(task.end, lenTaskEndedAt.getOrDefault(task.end, 0L) + task.end - task.start);
            }

            //Заполнение quests из input.txt
            int numQuest = Integer.parseInt(input.readLine());
            for (int i = 0; i < numQuest; i++) {
                String[] stringQuests = input.readLine().split(" ");
                Quest quest = new Quest(Integer.parseInt(stringQuests[0]), Integer.parseInt(stringQuests[1]), Integer.parseInt(stringQuests[2]));
                quests.add(quest);
                costTaskStartedAt.putIfAbsent(quest.start-1, 0L);
                costTaskStartedAt.putIfAbsent(quest.end, 0L);
                lenTaskEndedAt.putIfAbsent(quest.start-1, 0L);
                lenTaskEndedAt.putIfAbsent(quest.end, 0L);
            }

            makeCumulativeSum(costTaskStartedAt);
            makeCumulativeSum(lenTaskEndedAt);

            for (Quest quest : quests) {
                if (quest.type == 1) {
                    System.out.println(costTaskStartedAt.get(quest.end) - costTaskStartedAt.get(quest.start-1));
                } else {
                    System.out.println(lenTaskEndedAt.get(quest.end) - lenTaskEndedAt.get(quest.start-1));
                }
            }
        }
    }

    static void makeCumulativeSum(Map<Integer,Long> map) {
        long currentSum = 0;
        for (Integer key : map.keySet().stream().sorted().collect(Collectors.toList())) {
            currentSum += map.get(key);
            map.put(key, currentSum);
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
        int start;
        int end;
        int type;

        public Quest(int start, int end, int type) {
            this.start = start;
            this.end = end;
            this.type = type;
        }
    }

}