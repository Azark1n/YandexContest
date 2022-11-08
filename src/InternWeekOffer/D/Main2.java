package InternWeekOffer.D;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
        String inputFileName = "src/InternWeekOffer/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            int count = Integer.parseInt(input.readLine());
            String s1 = input.readLine();

            char[][] arr = new char[count][s1.length()];
            arr[0] = s1.toCharArray();

            for (int i = 1; i < count; i++) {
                input.read(arr[i]);
                input.read();
            }

            int pairCount = 0;
            for (int i = 0; i < count; i++) {
                for (int j = i+1; j < count; j++) {
                    if (distinctCount(arr[i], arr[j]) == 1){
                        pairCount++;
                    }
                }
            }
            output.write(String.valueOf(pairCount));
        }
    }

    private static int distinctCount(char[] s1, char[] s2) {
        int result = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                result++;
                if (result != 1) {
                    break;
                }
            }
        }
        return result;
    }
}