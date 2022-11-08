package TestInterview.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String J = scanner.nextLine();
        String S = scanner.nextLine();

        int count = 0;
        for (char cS : S.toCharArray()) {
            if (J.indexOf(cS) >= 0){
                count++;
            }
        }
        System.out.println(count);
    }
}