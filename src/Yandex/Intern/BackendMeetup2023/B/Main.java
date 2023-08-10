package Yandex.Intern.BackendMeetup2023.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"))) {
        try (BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()))) {

            List<Integer> widths = new ArrayList<>();
            List<Integer> sunWidths = new ArrayList<>();

            String[] s = input.readLine().split(" ");
            int plCount = Integer.parseInt(s[0]);
            int dobrCount = Integer.parseInt(s[1]);

            System.out.println(Integer.MAX_VALUE);

//            int curShadow = 0;
//            String[] s2 = input.readLine().split(" ");
//            for (int i = s2.length - 1; i >= 0; i--) {
//                if (s2[i].isBlank()) continue;
//                int cur = Integer.parseInt(s2[i]);
//                if (cur > curShadow) {
//                    sunWidths.add(cur - curShadow);
//                    curShadow = cur;
//                }
//            }

            List<Integer> num = new ArrayList<>();
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(input.readLine());
            while(m.find()) {
                num.add(Integer.parseInt(m.group()));
            }

            int curShadow = 0;
            //String[] s2 = input.readLine().split(" ");
            for (int i = num.size() - 1; i >= 0; i--) {
                int cur = num.get(i);
                if (cur > curShadow) {
                    sunWidths.add(cur - curShadow);
                    curShadow = cur;
                }
            }

            sunWidths.sort((i1, i2) -> i2 - i1);

            s = input.readLine().split(" ");
            for (String value : s) {
                widths.add(Integer.parseInt(value));
            }
            widths.sort((i1, i2) -> i2 - i1);

            int count = 0;
            int wi = 0;
            int si = 0;
            while (wi < widths.size() && si < sunWidths.size()) {
                if (widths.get(wi) <= sunWidths.get(si)) {
                    count++;
                    wi++;
                    si++;
                } else {
                    wi++;
                }
            }

            System.out.println(count);


        }
    }
}
