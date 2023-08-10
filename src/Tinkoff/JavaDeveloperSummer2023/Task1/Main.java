package Tinkoff.JavaDeveloperSummer2023.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        boolean ok = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i-1)) {
                continue;
            }
            ok = false;
            break;
        }
        if (ok) {
            System.out.println("YES");
            return;
        }

        ok = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i-1)) {
                continue;
            }
            ok = false;
            break;
        }
        if (ok) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}
