package Tinkoff.JavaDeveloperSummer2023.Task3;

import java.util.Scanner;

public class Main {

    static int[] arr = new int[4];
    static String s;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        s = scanner.nextLine();

        int curMin = Integer.MAX_VALUE;

        int i1 = 0;
        int i2 = 1;
        add(i1);
        add(i2);
        while (true) {
            if (strOK()) {
                int len = i2 - i1 + 1;
                if (len < curMin) {
                    curMin = len;
                }
                del(i1);
                i1++;
            } else {
                i2++;
                if (i2 == s.length()) {
                    break;
                }
                add(i2);
            }
        }

        if (curMin == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(curMin);
        }
    }

    static int ind(char ch) {
        return ch-97;
    }

    static boolean strOK() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) continue;
            return false;
        }
        return true;
    }

    static void add(int ind) {
        arr[ind(s.charAt(ind))]++;
    }

    static void del(int ind) {
        arr[ind(s.charAt(ind))]--;
    }

}
