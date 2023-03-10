package Yandex.AlgoTraining3b.preAlgoTraining.B;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        try(BufferedReader input = new BufferedReader(new FileReader(Main.class.getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){

            int n = Integer.parseInt(input.readLine());
            List<Integer> list = Arrays.stream(input.readLine().split(" ")).map(Integer::parseInt).toList();
            int [] arr = new int[]{1,23};
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
