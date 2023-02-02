package Other.TriangleByPascal_ok;

import java.io.*;
import java.math.BigInteger;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Other/TriangleByPascal/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try (BufferedReader input = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))) {

            int n = Integer.parseInt(input.readLine());
            StringJoiner stringJoiner = new StringJoiner(",");
            for (int k = 0; k <= n; k++) {
                stringJoiner.add(factorialStreamedParallel(n).divide(factorialStreamedParallel(k).multiply(factorialStreamedParallel(n - k))).toString());
            }

            output.write(stringJoiner.toString());
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static BigInteger factorialStreamedParallel(int n) {
        if (n < 2) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }
}
