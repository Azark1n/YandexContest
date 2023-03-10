package Yandex.TestInterview.E_ok;

import java.io.*;
import java.lang.invoke.MethodHandles;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){

            int[] codes = new int[26];

            String s1 = input.readLine();
            for (int i = 0; i < s1.length(); i++) {
                codes[s1.charAt(i) - 'a']++;
            }

            String s2 = input.readLine();
            for (int i = 0; i < s2.length(); i++) {
                codes[s2.charAt(i) - 'a']--;
            }

            int anagram = 1;
            for (int code : codes) {
                if (code != 0) {
                    anagram = 0;
                    break;
                }
            }

            output.write(String.valueOf(anagram));
        }
    }
}
