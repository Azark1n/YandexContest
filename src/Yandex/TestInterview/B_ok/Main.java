package Yandex.TestInterview.B_ok;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader input = new BufferedReader(new FileReader(Main.class.getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){
            int maxCount = 0;

            int count = Integer.parseInt(input.readLine());
            int currentCount = 0;
            for (int i = 0; i < count; i++) {
                if (input.readLine().equals("1")){
                    currentCount++;
                } else {
                    currentCount = 0;
                }
                if (currentCount > maxCount){
                    maxCount = currentCount;
                }
            }
            output.write(String.valueOf(maxCount));
        }
    }
}
