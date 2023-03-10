package Yandex.TestInterview.D_ok;

import java.io.*;
import java.lang.invoke.MethodHandles;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){

            //read one number to int
            int n = Integer.parseInt(input.readLine());

            int n2 = n * 2;
            if (n2 < 2) return;
            char[] chars = new char[n2];
            for (int i = 0; i < n2/2; i++) {
                chars[i] = '(';
            }
            for (int i = n2/2; i < n2; i++) {
                chars[i] = ')';
            }
            writeLine(output, chars);
            do {
                int i = n2 - 1;
                int c = 0;
                while (i >= 0) {
                    c += chars[i] == ')' ? -1 : 1;
                    if ((c < 0) && (chars[i] == '(')) break;
                    --i;
                }
                if (i < 0) break;

                chars[i++] = ')';
                int ind = i;
                for (; i < n2; i++) {
                    chars[i] = (i<= (n2-ind+c)/2+ind) ? '(' : ')';
                }
                writeLine(output, chars);
            }while (true);


            //formatting output to file
//            for (Integer ind : thingsInd) {
//                output.write(String.format("%2d:%2d %n", ind, 0));
//            }
        }
    }

    private static void writeLine(BufferedWriter output, char[] IntToFile) throws IOException {
        output.write(IntToFile);
        output.newLine();
    }

}
