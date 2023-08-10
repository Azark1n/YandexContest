package Tinkoff.JavaDeveloperSummer2023.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> a = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        int countZero = 0;
        for (int i = 0; i < a.size(); i++) {
            int curSum = a.get(i);
            for (int j = i + 1; j < a.size(); j++) {
                curSum += a.get(j);
                if (curSum == 0) {
                    countZero += a.size() - j;
                }
            }
        }
        System.out.println(countZero);
    }
}
