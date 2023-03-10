package Yandex.Intern.SpringSummer2023.C;

import java.io.*;
import java.util.ArrayList;

public class Main_ {
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

            ArrayList<Interval> sol = new ArrayList<>();

            int i = 0;
            while (i < n - 1) {
                while ((i < n - 1) && (price[i] >= price[i + 1]))
                    i++;

                if (i == n - 1)
                    break;

                Interval e = new Interval();
                e.buy = ++i;
                while ((i < n) && (price[i - 1] <= price[i]))
                    i++;

                e.sell = i;
                e.diff = price[e.sell-1] - price[e.buy-1];
                sol.add(e);
            }

            sol.sort((s1, s2) -> s2.diff - s1.diff);
            while (sol.size() > 2) {
                sol.remove(sol.size()-1);
            }
            sol.sort((s1, s2) -> s1.buy - s2.buy);

            if (sol.size() == 0)
                output.write("0");
            else {
                output.write(String.valueOf(sol.size()));
                output.newLine();
                for (int j = 0; j < sol.size(); j++) {
                    output.write(String.valueOf(sol.get(j).buy) + " " + String.valueOf(sol.get(j).sell));
                    output.newLine();
                }
            }
        }
    }

    static class Interval {
        int buy;
        int sell;
        int diff;
    }
}

