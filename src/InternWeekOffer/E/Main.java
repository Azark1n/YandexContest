package InternWeekOffer.E;

import java.io.*;

public class Main {
    private static int n;
    private static int m;
    private static int r;
    private static int r2;
    private static int[][] arr;

    public static void main(String[] args) throws IOException{
        String inputFileName = "src/InternWeekOffer/E/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            String[] string1 = input.readLine().split(" ");
            n = Integer.parseInt(string1[0]);
            m = Integer.parseInt(string1[1]);
            r = Integer.parseInt(string1[2]);
            r2 = r*r;

            arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                String[] nextS = input.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(nextS[j]);
                }
            }

            int max = 0;

            //цикл по всем
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int sum = 0;
                    sum += arr[i][j];
                    sum += sumLine(i, j, 1, 0);
                    sum += sumLine(i, j, -1, 0);
                    sum += sumLine(i, j, 0, 1);
                    sum += sumLine(i, j, 0, -1);

                    sum += sumSect(i, j, 1, 1);
                    sum += sumSect(i, j, -1, 1);
                    sum += sumSect(i, j, 1, -1);
                    sum += sumSect(i, j, -1, -1);
                    if (max < sum) {
                        System.out.println(i + "_" + j + "_" + sum);
                        max = sum;
                    }
                }
            }
            output.write(String.valueOf(max));
        }
    }

    private static int sumSect(int x, int y, int kX, int kY) {
        int i = x + kX;
        int j = y + kY;

        int result = 0;
        while (i >= 0 && i < n && dist2(x, y, i, j) <= r2) {
            j = y + kY;
            while (j >= 0 && j < m && dist2(x, y, i, j) <= r2) {
                result += arr[i][j];
                j += 1 * kY;
            }
            i += 1 * kX;
        }
        return result;
    }

    private static int sumLine(int x, int y, int kX, int kY) {

        int result = 0;
        if (kX != 0) {
            int j = y + kY;
            int i = x + kX;
            while (i >= 0 && i < n && (x-i)*(x-i) <= r2) {
                result += arr[i][j];
                i += 1 * kX;
            }
        }

        if (kY != 0) {
            int j = y + kY;
            int i = x + kX;
            while (j >= 0 && j < m && (y-j)*(y-j) <= r2) {
                result += arr[i][j];
                j += 1 * kY;
            }
        }
        return result;
    }

    private static int dist2(int x, int y, int i, int j){
        return (x-i)*(x-i) + (y-j)*(y-j);
    }

}