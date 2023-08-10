package Yandex.Intern.InternsDaySummer2023.A;

import java.io.*;
import java.lang.invoke.MethodHandles;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        try (BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
             BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {

            int n = Integer.parseInt(input.readLine());
            int secCount = 0;
            int curSec = 86400;
            int dayCount = 0;
            for (int i = 0; i < n; i++) {
                String[] split = input.readLine().split(":");
                secCount = Integer.parseInt(split[0]) * 3600 + Integer.parseInt(split[1]) * 60 + Integer.parseInt(split[2]);
                if (secCount <= curSec) {
                    dayCount++;
                    curSec = -1;
                }
                curSec = secCount;
            }
            System.out.println(dayCount);
        }
    }

}
