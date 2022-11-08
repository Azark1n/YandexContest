package InternWeekOffer.A;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputFileName = "src/InternWeekOffer/A/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            ArrayList<String[]> arr = new ArrayList<>();
            arr.add(input.readLine().split(" "));
            arr.add(input.readLine().split(" "));
            arr.add(input.readLine().split(" "));

            ArrayList<String> var1 = add(arr.get(0), arr.get(1));
            ArrayList<String> var2 = add(arr.get(0), arr.get(2));
            ArrayList<String> var3 = add(arr.get(1), arr.get(0));
            ArrayList<String> var4 = add(arr.get(1), arr.get(2));
            ArrayList<String> var5 = add(arr.get(2), arr.get(0));
            ArrayList<String> var6 = add(arr.get(2), arr.get(1));


        }
    }

    private static ArrayList<String> add(String[] s1, String[] s2) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            int count = 0;
            for (int j = 0; j < s2.length; j++) {
                if ((i+j) < s1.length && s1[i+j].equals(s2[j])){
                    count++;
                } else {
                    break;
                }
            }
            if (count == s2.length || (i+count+1) == s1.length) {

                while (i < s1.length || count < s2.length){
                    result.add(i < s1.length ? s1[i] : s2[count++]);
                }
                return result;
            }
        }
        return result;
    }
}