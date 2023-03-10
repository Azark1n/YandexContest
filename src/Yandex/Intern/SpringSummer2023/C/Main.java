package Yandex.Intern.SpringSummer2023.C;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/YandexInternSpringSummer2023/C/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try (BufferedReader input = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))) {

            int k = 2;
            int n = Integer.parseInt(input.readLine());
            String[] values = input.readLine().split(" ");

            int[] price = new int[n];
            for (int i = 0; i < values.length; i++) {
                price[i] = Integer.parseInt(values[i]);
            }

            int[] b = new int[2];
            int tranFee = 0;
            max_profit(price, b, n, tranFee);
            System.out.println(b[0] + ", " + b[1]);
        }
    }

    static int max_profit(int a[], int b[], int n, int fee) {
        int i, j, profit;
        int l, r, diff_day = 1, sum = 0;
        // b [0] будет содержать максимальную прибыль
        b[0] = 0;
        // b [1] будет содержать день
        // по которой мы получаем максимальную прибыль
        b[1] = diff_day;
        for (i = 1; i < n; i++) {
            l = 0;
            r = diff_day;
            sum = 0;
            for (j = n - 1; j >= i; j--) {
                // здесь найти максимальную прибыль
                profit = (a[r] - a[l]) - fee;
                // если мы получим меньше или равно нулю
                // это означает, что мы не получаем прибыль
                if (profit > 0) {
                    sum = sum + profit;
                }
                l++;
                r++;
            }
            // проверяем, больше ли сумма, чем максимум, затем сохраняем новый максимум
            if (b[0] < sum) {
                b[0] = sum;
                b[1] = diff_day;
            }
            diff_day++;
        }
        return 0;
    }

    static class Node {
        int buy;
        int sell;
        int diff;
    }

}

