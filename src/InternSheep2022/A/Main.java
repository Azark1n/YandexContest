package InternSheep2022.A;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputFileName = "src/InternSheep2022/A/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            int numString = Integer.parseInt(input.readLine());
            for (int i = 0; i < numString; i++) {
                String[] strings = input.readLine().split(",");
                String result = getResultString(strings);
                output.write(result.toUpperCase());
                output.write(" ");
            }

        }
    }

    static String getResultString(String[] strings) {
        HashSet<Character> razlichLetters = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                razlichLetters.add(strings[i].charAt(j));
            }
        }
        int sumDM = Integer.parseInt(strings[3]) + Integer.parseInt(strings[3]);
        int rez = razlichLetters.size() + 64 * sumDM(strings[3], strings[4]) + 256 * alphabetPosition(strings[0].charAt(0));
        return String.format("%1$03X",rez & 0xfff);
    }

    static int sumDM(String strD, String strM) {
        int sum = 0;
        for (int i = 0; i < strD.length(); i++) {
            sum += Integer.parseInt(strD.substring(i, i+1));
        }
        for (int i = 0; i < strM.length(); i++) {
            sum += Integer.parseInt(strM.substring(i, i+1));
        }
        return sum;
    }

    static int alphabetPosition(char c) {
        int a='a';
        int position=(String.valueOf(c).toLowerCase().codePointAt(0))-a+1;
        return position;
    }
}