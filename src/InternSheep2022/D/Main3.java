package InternSheep2022.D;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {

    //Структуры для хранения:
    static ArrayList<Task> tasks = new ArrayList<>();

    static ArrayList<Quest> quests = new ArrayList<>();

    //Карта накопительной стоимостей заказов на даты запросов. Ключ - дата. Значение - сумма
    static Map<Integer, Long> tasksCostStartedAt = new HashMap<>();

    //Карта накопительной длительности заказов на даты запросов. Ключ - дата. Значение - сумма
    static Map<Integer, Long> tasksLenEndedAt = new HashMap<>();

    //Список всех дат запросов первого типа. И начальные и конечные.
    static List<Integer> questDatePointsType1;

    //Список всех дат запросов второго типа. И начальные и конечные.
    static List<Integer> questDatePointsType2;

    //Заполнение:

    //Заполняем questDatePointsType1. Сортируем
    //Сортируем tasks по датам старта
    //Идем по спискам (tasks и questDatePointsType1) параллельно, каждый по своему указателю
    //  tasks итерируем по start
    //  Из tasks получаем стоимость (cost), ведем накопительную сумму
    //  В tasksCostStartedAt по ключу даты элемента questDatePointsType1 записываем накопительную сумму

    //Заполняем questDatePointsType2. Сортируем
    //Сортируем tasks по датам окончания
    //Идем по спискам (tasks и questDatePointsType2) параллельно, каждый по своему указателю
    //  tasks итерируем по end
    //  Из tasks получаем длительность (end-start), ведем накопительную сумму
    //  В tasksLenEndedAt по ключу даты элемента questDatePointsType2 записываем накопительную сумму

    //Получение:
    //Цикл по списку quests
    //  Для type==1 сумма стоимостей всех заказов равна tasksCostStartedAt.get(quest.end) - tasksCostStartedAt.get(quest.start)
    //  Для type==2 сумма длительностей всех заказов равна tasksLenEndedAt.get(quest.end) - tasksLenEndedAt.get(quest.start)

    public static void main(String[] args) throws IOException {

        String inputFileName = "src/InternSheep2022/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try (BufferedReader input = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))) {

            //Заполнение tasks из input.txt
            int numTask = Integer.parseInt(input.readLine());
            for (int i = 0; i < numTask; i++) {
                String[] stringTasks = input.readLine().split(" ");
                tasks.add(new Task(Integer.parseInt(stringTasks[0]), Integer.parseInt(stringTasks[1]), Integer.parseInt(stringTasks[2])));
            }

            //Заполнение quests из input.txt
            int numQuest = Integer.parseInt(input.readLine());
            for (int i = 0; i < numQuest; i++) {
                String[] stringQuests = input.readLine().split(" ");
                quests.add(new Quest(Integer.parseInt(stringQuests[0]), Integer.parseInt(stringQuests[1]), Integer.parseInt(stringQuests[2])));
            }

            questDatePointsType1 = quests.stream()
                    .filter(quest -> quest.type == 1)
                    .flatMap(quest -> Stream.of(quest.start, quest.end))
                    .sorted()
                    .distinct()
                    .collect(Collectors.toList());
            tasks.sort(Comparator.comparingInt(t -> t.start));
            initTasksCostStartedAt();

            questDatePointsType2 = quests.stream()
                    .filter(quest -> quest.type == 2)
                    .flatMap(quest -> Stream.of(quest.start, quest.end))
                    .sorted()
                    .distinct()
                    .collect(Collectors.toList());
            tasks.sort(Comparator.comparingInt(t -> t.end));
            initTasksLenEndedAt();

            for (Quest quest : quests) {
                if (quest.type == 1) {
                    System.out.println(tasksCostStartedAt.get(quest.end) - tasksCostStartedAt.getOrDefault(quest.start-1, tasksCostStartedAt.get(quest.start)));
                } else {
                    System.out.println(tasksLenEndedAt.get(quest.end) - tasksLenEndedAt.getOrDefault(quest.start-1, tasksLenEndedAt.get(quest.start)));
                }
            }

        }
    }

    static void initTasksCostStartedAt() {
        int taskIndex = 0;
        int questIndex = 0;
        int taskTime = 0;
        int questTime = 0;
        long sum = 0;
        while (questIndex < questDatePointsType1.size()) {
            questTime = questDatePointsType1.get(questIndex);

            if (taskIndex < tasks.size()) {
                taskTime = tasks.get(taskIndex).start;
                if (taskTime <= questTime) {
                    if (taskTime == questTime) {
                        tasksCostStartedAt.putIfAbsent(questTime-1, sum);
                    }
                    sum += tasks.get(taskIndex).cost;
                    taskIndex++;
                    continue;
                }
            }

            tasksCostStartedAt.put(questTime, sum);
            questIndex++;
        }
    }

    static void initTasksLenEndedAt() {
        int taskIndex = 0;
        int questIndex = 0;
        int taskTime = 0;
        int questTime = 0;
        long sum = 0;
        while (questIndex < questDatePointsType2.size()) {
            questTime = questDatePointsType2.get(questIndex);

            if (taskIndex < tasks.size()) {
                taskTime = tasks.get(taskIndex).end;
                if (taskTime <= questTime) {
                    if (taskTime == questTime) {
                        tasksLenEndedAt.putIfAbsent(questTime-1, sum);
                    }
                    sum += tasks.get(taskIndex).end - tasks.get(taskIndex).start;
                    taskIndex++;
                    continue;
                }
            }

            tasksLenEndedAt.put(questTime, sum);
            questIndex++;
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