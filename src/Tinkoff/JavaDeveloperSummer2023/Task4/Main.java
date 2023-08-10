package Tinkoff.JavaDeveloperSummer2023.Task4;

import java.util.*;

public class Main {

    static TreeMap<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> a = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        for (Integer integer : a) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        for (int i = a.size() - 1; i >= 0; i--) {
            if (mapSku()) {
                System.out.println(i+1);
                return;
            }

            if (map.get(a.get(i)) == 1) {
                map.remove(a.get(i));
            } else {
                map.put(a.get(i), map.get(a.get(i))-1);
            }
        }

    }

    static boolean mapOK() {
        HashSet<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            set.add(value);
        }
        return set.size() == 1;
    }

    static boolean mapSku() {
        int minInd = 0;
        int minValue = Integer.MAX_VALUE;
        int maxInd = 0;
        int maxValue = Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            if (map.get(key) < minValue) {
                minValue = map.get(key);
                minInd = key;
            }
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxInd = key;
            }
        }

        boolean result = false;

        if (minValue == 1) {
            map.remove(minInd);
            result = mapOK();
            map.put(minInd, minValue);
            if (result) {
                return true;
            }
        }

        map.put(maxInd, maxValue - 1);
        result = mapOK();
        map.put(maxInd, maxValue);
        if (result) {
            return true;
        }
        return false;
    }

}
