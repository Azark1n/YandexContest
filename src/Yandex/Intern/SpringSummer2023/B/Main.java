package Yandex.Intern.SpringSummer2023.B;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/YandexInternSpringSummer2023/B/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            String[] arr1 = input.readLine().split(" ");
            int N = Integer.parseInt(arr1[0]);
            int X = Integer.parseInt(arr1[1]);
            long T = Long.parseLong(arr1[2]);

            ArrayList<node> nodes = new ArrayList<>();
            String[] arr2 = input.readLine().split(" ");
            for (int i = 0; i < arr2.length; i++) {
                int abs = Math.abs(Integer.parseInt(arr2[i]) - X);
                if (abs > T) continue;
                nodes.add(new node(abs, i+1));
            }
            arr2 = null;
            nodes.sort((c1, c2) -> c1.value - c2.value);

            ArrayList<node> resultNodes = new ArrayList<>();
            long current = T;
            for (node node : nodes) {
                if (current < node.value) break;
                resultNodes.add(node);
                current -= node.value;
            }

            output.write(String.valueOf(resultNodes.size()));
            output.newLine();
            for (node resultNode : resultNodes) {
                output.write(String.valueOf(resultNode.index) + " ");
            }
//            resultNodes.forEach(System.out::println);
        }
    }

    private static class node {
        int value;
        int index;

        public node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public String toString() {
            return "YandexInternSpringSummer2023.B.Main.node{" +
                    "value=" + value +
                    ", index=" + index +
                    '}';
        }
    }
}


