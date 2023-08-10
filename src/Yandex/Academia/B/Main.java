package Yandex.Academia.B;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        try(BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){

            //read one number to int
            int numString = Integer.parseInt(input.readLine());
            //read to array of String
            for (int i = 0; i < numString; i++) {
                String[] values = input.readLine().split(",");
            }

            //read "1 5 -12" => List<Integer>
            List<Integer> list = Arrays.stream(input.readLine().split(" ")).map(Integer::parseInt).toList();

            //read String to Set of Character
            String J = input.readLine();
            Set<Character> setJ = J.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

            //...

            //create list and fill it recursive
            List<Integer> thingsInd = new ArrayList<>();
            saveThingsIndRec(thingsInd);

            //formatting output to file
            for (Integer ind : thingsInd) {
                output.write(String.format("%2d:%2d %n", ind, 0));
            }
        }
    }
    //recursive call
    static void saveThingsIndRec(List<Integer> result) {
        result.add(null);
    }

    private static void writeLine(BufferedWriter output, char[] IntToFile) throws IOException {
        output.write(IntToFile);
        output.newLine();
    }
}
