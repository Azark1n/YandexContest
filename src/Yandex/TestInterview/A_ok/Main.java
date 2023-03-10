package Yandex.TestInterview.A_ok;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader input = new BufferedReader(new FileReader(Main.class.getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){

            String J = input.readLine();
            String S = input.readLine();

            Set<Character> setJ = J.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

            int sum = 0;
            for (char c : S.toCharArray()) {
                if (setJ.contains(c)) {
                    sum++;
                }
            }

            output.write(String.valueOf(sum));
        }
    }
}
