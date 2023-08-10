package Yandex.Academia.A;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int[] R;
    static ArrayList<HashSet<Integer>> sets = new ArrayList<>();
    static int maxI;
    static int minI;
    static TreeMap<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {
//        try(BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        try (BufferedReader input = new BufferedReader(new FileReader(MethodHandles.lookup().lookupClass().getResource("input.txt").getFile()));
             BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))) {

            String[] strings = input.readLine().split(" ");
            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);
            int q = Integer.parseInt(strings[2]);

            for (int i = 0; i < n; i++) {
                HashSet<Integer> curSet = new HashSet<>();
                sets.add(curSet);
                for (int j = 0; j < m; j++) {
                    curSet.add(j);
                }
                map.put(i, 0);
            }
            R = new int[n];

            for (int qi = 0; qi < q; qi++) {
                String[] split = input.readLine().split(" ");
                switch (split[0]) {
                    case "DISABLE":
                        disable(Integer.parseInt(split[1]) - 1, Integer.parseInt(split[2]) - 1);
                        break;
                    case "RESET":
                        reset(Integer.parseInt(split[1]) - 1, m);
                        break;
                    case "GETMIN":
                        System.out.println(entriesSortedByValues(map).first().getKey()+1);
                        //refresh();
                        //System.out.println(minI + 1);
                        //System.out.println(map.headMap());
                        break;
                    case "GETMAX":
                        System.out.println(entriesSortedByValues(map).last().getKey()+1);
                        //refresh();
                        //System.out.println(maxI + 1);
                        break;
                }
            }
        }
    }

    static SortedSet<Map.Entry<Integer,Integer>> entriesSortedByValues(Map<Integer,Integer> map) {
        SortedSet<Map.Entry<Integer,Integer>> sortedEntries = new TreeSet<>(
                new Comparator<Map.Entry<Integer,Integer>>() {
                    @Override public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        if (res != 0) {
                            return res;
                        } else {
                            return e1.getKey().compareTo(e2.getKey());
                        }
//                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    private static boolean disable(int i, int j) {
        boolean remove = sets.get(i).remove(j);
        if (remove) {
            map.put(i, sets.get(i).size() * R[i]);
//            refresh();
        }
        return remove;
    }

    private static void reset(int i, int m) {
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < m; j++) {
            set.add(j);
        }
        sets.set(i, set);
        R[i]++;
        //refresh();
        map.put(i, m * R[i]);
    }

//    private static void refresh() {
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        minI = 0;
//        maxI = 0;
//        for (int i = 0; i < sets.size(); i++) {
//            int cur = sets.get(i).size() * R[i];
//            if (cur > max) {
//                max = cur;
//                maxI = i;
//            }
//            if (cur < min) {
//                min = cur;
//                minI = i;
//            }
//        }
//    }

}
