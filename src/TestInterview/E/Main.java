package TestInterview.E;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader("src/TestInterview/E/input.txt"));
             BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {

            String str1 = input.readLine();
            String str2 = input.readLine();
            List<Character> result = str2.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
            for (char c : str1.toCharArray()) {
                if (result.contains(Character.valueOf(c)))
                    result.remove(Character.valueOf(c));
            }

            if (!str1.isEmpty() && str1.length() == str2.length() && result.isEmpty()){
                output.write(String.valueOf(1));
            } else {
                output.write(String.valueOf(0));
            }
        }
    }
}

