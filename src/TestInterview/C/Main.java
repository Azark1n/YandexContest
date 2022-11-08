package TestInterview.C;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader("src/TestInterview/C/input.txt"));
             BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {
            int count = Integer.parseInt(input.readLine());
            if (count == 0) return;
            int current = Integer.parseInt(input.readLine());
            int next = current;
            output.write(String.valueOf(current));
            output.newLine();
            for (int i = 1; i < count; i++) {
                if (current != (next = Integer.parseInt(input.readLine()))){
                    output.write(String.valueOf(next));
                    output.newLine();
                    current = next;
                }
            }
        }
    }
}

