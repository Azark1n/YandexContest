package Tinkoff.JavaDeveloperSummer2023.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        float v = ((float)n * k / m);
        System.out.println((int)Math.ceil(v));
    }
}
