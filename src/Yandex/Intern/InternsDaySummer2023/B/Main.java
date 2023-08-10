package Yandex.Intern.InternsDaySummer2023.B;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        try (BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
             BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {

            Character replaced;

            int n = Integer.parseInt(input.readLine());
            for (int i = 0; i < n; i++) {
                HashMap<Character, Character> map1 = new HashMap<>();
                HashMap<Character, Character> map2 = new HashMap<>();
                String s1 = input.readLine();
                String s2 = input.readLine();
                boolean result = true;
                for (int j = 0; j < s1.length(); j++) {
                    char c1 = s1.charAt(j);
                    char c2 = s2.charAt(j);
                    if (map1.containsKey(c1) && map1.get(c1) != c2) {
                        result = false;
                        break;
                    } else if (map2.containsKey(c2) && map2.get(c2) != c1) {
                        result = false;
                        break;
                    } else {
                        map1.put(c1, c2);
                        map2.put(c2, c1);
                    }
                }
                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
