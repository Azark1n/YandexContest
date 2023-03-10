package Yandex.Intern.SpringSummer2023.A;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){

            int N = Integer.parseInt(input.readLine());
            String[] arrC = input.readLine().split(" ");
            String[] arrR = input.readLine().split(" ");

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arrC.length; i++) {
                map.put(Integer.parseInt(arrC[i]), Integer.parseInt(arrR[i]));
            }
            arrC = null;
            arrR = null;

            int K = Integer.parseInt(input.readLine());
            String[] arrK = input.readLine().split(" ");
            int count = 0;
            Integer currentR = map.get(Integer.parseInt(arrK[0]));
            for (int i = 0; i < arrK.length; i++) {
                Integer newR = map.get(Integer.parseInt(arrK[i]));
                if (!currentR.equals(newR)) {
                    count++;
                    currentR = newR;
                }
            }

            output.write(String.format("%d %n", count));
        }
    }
}
