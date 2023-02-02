import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Template {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/TestName/A/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            //read "1 5 -12" => List<Integer>
            List<Integer> list = Arrays.stream(input.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            int numString = Integer.parseInt(input.readLine());
            for (int i = 0; i < numString; i++) {
                String[] values = input.readLine().split(",");

            }

            output.write("some");
        }
    }
}
