package Yandex.AlgoTraining3b.HW1.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    /*В массиве int с индексом (код символа) накапливаем количество встречающихся символов
    Запоминаем макс в массиве
    Цикл i от макс до 1
        Цикл по массиву, определяем количество подряд идущих больше i (хеш)
        все остальные - пробелы
        Выводим через фунцию(символ, количество повторений)
    Функция выводит через цикл output.write?*/
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine();
            String s2 = br.readLine();
            int number1 = Integer.parseInt(s1);
            int number2 = Integer.parseInt(s2);
            System.out.println(number1 + number2);
        } catch (Exception e) {
        }
    }
}
