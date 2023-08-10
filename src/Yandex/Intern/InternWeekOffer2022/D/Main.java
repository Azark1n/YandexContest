package Yandex.Intern.InternWeekOffer2022.D;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputFileName = "src/YandexIntern.InternWeekOffer/D/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            int count = Integer.parseInt(input.readLine());
            String[] arr = new String[count];
            for (int i = 0; i < count; i++) {
                arr[i] = input.readLine();
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

    private static int distinctCount(String s1, String s2) {
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result++;
                if (result != 1) {
                    break;
                }
            }
        }
        return result;
    }
}