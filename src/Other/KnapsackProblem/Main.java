package Other.KnapsackProblem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //String inputFileName = "src/Other/KnapsackProblem/input.txt";
        String inputFileName = (args.length > 0 ? args[0] : "") + "input.txt";
        String outputFileName = "output.txt";

        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            final int W = Integer.parseInt(input.readLine());
            final int N = Integer.parseInt(input.readLine());

            final int[] w = new int[N+1];
            final int[] p = new int[N+1];

            for (int i = 1; i <= N; i++) {
                String[] values = input.readLine().split(":");
                w[i] = Integer.parseInt(values[0]);
                p[i] = Integer.parseInt(values[1]);
            }

            final int[][] K = new int[N+1][W+1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= W; j++) {
                    if (j >= w[i]) {
                        K[i][j] = Math.max(K[i - 1][j], p[i] + K[i - 1][j - w[i]]);
                    } else {
                        K[i][j] = K[i - 1][j];
                    }
                }
            }

            List<Integer> thingsInd = new ArrayList<>();
            saveThingsIndRec(thingsInd, N, W, K, w);
            for (Integer ind : thingsInd) {
                output.write(String.format("%d:%d %n", w[ind], p[ind]));
            }
        }
    }

    static void saveThingsIndRec(List<Integer> result, int i, int j, int[][] K, int[] w) {
        if (K[i][j] == 0) return;
        if (K[i][j] == K[i - 1][j]) {
            saveThingsIndRec(result, i-1, j, K, w);
        } else {
            result.add(i);
            saveThingsIndRec(result, i-1, j-w[i], K, w);
        }
    }
}
