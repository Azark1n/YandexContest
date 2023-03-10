package Yandex.AlgoTraining3b.preAlgoTraining.A_ok;

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

            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    output.write("-1");
                    return;
                }
            }
            output.write(String.valueOf(list.get(n - 1) - list.get(0)));
        }
    }
}
