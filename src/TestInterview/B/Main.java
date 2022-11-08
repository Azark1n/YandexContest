package TestInterview.B;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int maxCount = 0;
        try (BufferedReader input = new BufferedReader(new FileReader("src/TestInterview/B/input.txt"))) {
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
        }
        try (BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {
            output.write(String.valueOf(maxCount));
        }
    }
}
