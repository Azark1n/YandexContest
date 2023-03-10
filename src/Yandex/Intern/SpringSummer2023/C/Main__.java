package Yandex.Intern.SpringSummer2023.C;

import java.io.*;

public class Main__ {
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

            int profit = maxProfit(price, n);

            System.out.println(profit);
        }
    }

    static int maxProfit(int price[], int n) {
        // Создать массив прибыли и инициализировать его как 0
        int profit[] = new int[n];

        /* Получите максимальную прибыль только с одной транзакцией
            позволил. После этого цикла прибыль [i] содержит максимум
            прибыль от цены [i..n-1], используя не более одного транс. */
        int max_price = price[n - 1];
        Node node = new Node();
        node.sell = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            // max_price имеет максимум цены [i..n-1]
            if (price[i] > max_price) {
                max_price = price[i];
                node.sell = i;
                node.diff = price[node.sell] - price[node.buy];
            }

            // мы можем получить прибыль [i], взяв максимум:
            // а) предыдущий максимум, т. е. прибыль [i + 1]
            // б) прибыль путем покупки по цене [i] и продажи по max_price
            if (profit[i + 1] > max_price - price[i]) {
                profit[i] = profit[i + 1];
            } else {
                profit[i] = max_price - price[i];
                node.buy = i;
                node.diff = price[node.sell] - price[node.buy];
            }
            //profit[i] = Math.max(profit[i + 1], max_price - price[i]);
        }

        /* Получить максимальную прибыль с двумя транзакциями
            После этого цикла прибыль [n-1] содержит результат */
        int min_price = price[0];
        Node node2 = new Node();
        node2.buy = 0;
        for (int i = 1; i < n; i++) {
            // min_price - минимальная цена в цене [0..i]
            if (price[i] < min_price) {
                min_price = price[i];
                node2.buy = i;
                node2.diff = price[node2.sell] - price[node2.buy];
            }

            // Максимальная прибыль - максимум:
            // а) предыдущий максимум, т. е. прибыль [i-1]
            // b) (Купить, Продать) по адресу (min_price, цена [i]) и добавить
            // прибыль другого транс. хранится в прибыли [я]
            if (profit[i - 1] > profit[i] + (price[i] - min_price)) {
                profit[i] = profit[i - 1];
                node2.sell = i - 1;
                node2.diff = price[node2.sell] - price[node2.buy];
            } else {
                profit[i] = profit[i] + (price[i] - min_price);
                node2.sell = i;
                node2.diff = price[node2.sell] - price[node2.buy];
            }
            //profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - min_price));
        }
        int result = profit[n - 1];
        return result;
    }

    static class Node {
        int buy;
        int sell;
        int diff;
    }
}

