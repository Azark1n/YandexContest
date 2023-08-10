package Yandex.Intern.BackendMeetup2023.A;

import java.io.*;
import java.lang.invoke.MethodHandles;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        try (BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
             BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {

            String[] s1 = input.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);

            char[][] chars = new char[n][m];
            for (int i = n - 1; i >= 0; i--) {
                chars[i] = input.readLine().toCharArray();
            }

            int countI = Integer.parseInt(input.readLine());
            int[] rowsI = new int[countI];
            char[] charsI = new char[countI];
            for (int i = 0; i < countI; i++) {
                String[] si = input.readLine().split(" ");
                rowsI[i] = Integer.parseInt(si[1]);
                charsI[i] = si[2].charAt(0);
            }

            int curInd = 1;
            for (int i = 0; i < countI; i++) {
                for (int i1 = 0; i1 < rowsI[i]; i1++) {
                    for (int j = 0; j < m; j++) {
                        if (chars[curInd][j] == ' '){
                            chars[curInd][j] = charsI[i];
                        }
                    }
                    curInd++;
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                System.out.println(chars[i]);
            }
        }
    }

}
