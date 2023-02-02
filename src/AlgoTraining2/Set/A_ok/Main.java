package AlgoTraining2.Set.A_ok;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/AlgoTraining3/Set/A/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            List<Integer> list = Arrays.stream(input.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int n = list.size();
            int x = Integer.parseInt(input.readLine());

            //
            HashSet<Integer> set = new HashSet<>();
            for (Integer current : list) {
                int target = x - current;
                if (current == target) {
                    continue;
                }
                if (set.contains(target)) {

                    output.write(current + ", " + target);
                    return;
                }
                set.add(current);
            }
            output.write("0, 0");
        }
    }
}
