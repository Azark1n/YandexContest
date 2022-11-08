package InternSheep2022.D;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main4NotComplete {

    // Индекс - ключевые временные отметки, возможен весь интервал int, но с детализацией до 16 (& ...FFFF0)
    // пример: 0 16 32 48 64 80...
    static HashMap<Integer, TaskPiece> tasksStartedAt = new HashMap<>();
//    static ArrayList<Task> tasks111 = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        // Наполнение мапы
        // 1. Сортируем список заказов по датам старта
        // 2. Проходимся от 0 до MAX_INT с шагом 16
        // 3. Заполняем мапу tasksStartedAt в соответствии с ее описанием

        // Получение количества задач, стартовавших на любую указанную дату:
        // 1. Из мапы получаем по ближайшей меньшей ключевой дате TaskPiece
        // 2. В цикле идем до нужно даты и суммируем

        String inputFileName = "src/InternSheep2022/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

//            int numTask = Integer.parseInt(input.readLine());
//            for (int i = 0; i < numTask; i++) {
//                String[] stringTasks = input.readLine().split(" ");
//                tasks111.add(new Task(Integer.parseInt(stringTasks[0]), Integer.parseInt(stringTasks[1]), Integer.parseInt(stringTasks[2])));
//            }
//
//            int numQuest = Integer.parseInt(input.readLine());
//            for (int i = 0; i < numQuest; i++) {
//                String[] stringQuests = input.readLine().split(" ");
//                quests111.add(new Quest(Integer.parseInt(stringQuests[0]), Integer.parseInt(stringQuests[1]), Integer.parseInt(stringQuests[2])));
//            }


        }
    }


    static class TaskPiece {
        // Сумма всех заказов до (и в том числе) указанной даты
        int sumBefore;
        // Список всех заказов (по временным отметкам) после указанной даты, но до следующей ключевой
        ArrayList<Integer> times = new ArrayList<>();
    }

}