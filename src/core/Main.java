package core;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int to = 1;
        int from = 1;
        int dx = to - from;
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(from, 0);
        for (int i = 0; i <= dx; i++) {
            if (dp.get(from + i) != null) {
                int to1 = (from +i) * 2;
                if (to1 <= to && (dp.get(to1) == null || dp.get(to1) > dp.get(from + i) + 1)) {
                    dp.put(to1, dp.get(from + i) + 1);
                }
                to1 = (from +i) * 10 + 1;
                if (to1 <= to &&  (dp.get(to1) == null || dp.get(to1) > dp.get(from + i) + 1)) {
                    dp.put(to1, dp.get(from + i) + 1);
                }
            }
        }
        System.out.println(dp.get(to));
    }

//        public static void main(String[] args) {
//
//        double[][] w = new double[][]{
//                {0,1,Integer.MAX_VALUE,2,Integer.MAX_VALUE,Integer.MAX_VALUE},
//                {1,0,3,4,Integer.MAX_VALUE,Integer.MAX_VALUE},
//                {Integer.MAX_VALUE,3,0,1,2,2},
//                {2,4,1,0,4,Integer.MAX_VALUE},
//                {Integer.MAX_VALUE,Integer.MAX_VALUE,2,4,0,2},
//                {Integer.MAX_VALUE,Integer.MAX_VALUE,2,Integer.MAX_VALUE,2,0}};
//        int[][] r = new int[w.length][w[0].length];
//        for (int k = 0; k <= w.length; k++) {
//            if(k == 0){
//                for (int i = 0; i < w.length; i++) {
//                    for (int j = 0; j < w.length; j++) {
//                        r[i][j] = w[i][j] == Integer.MAX_VALUE||i==j ?0:j+1;
//                    }
//                }
//
//            } else {
//                for (int i = 0; i < w.length; i++) {
//                    for (int j = 0; j < w.length; j++) {
//                        r[i][j] = w[i][j]>w[i][k-1]+w[k-1][j]?k:r[i][j];
//                    }
//                }
//                for (int i = 0; i < w.length; i++) {
//                    for (int j = 0; j < w.length; j++) {
//                        w[i][j] = w[i][j]>w[i][k-1]+w[k-1][j]?w[i][k-1]+w[k-1][j]:w[i][j];
//                    }
//                }
//            }
//
//            for (double[] doubles : w) {
//                for (double aDouble : doubles) {
//                    if(aDouble == Integer.MAX_VALUE){
//                        System.out.print("∞,");
//                    } else {
//                        System.out.print(aDouble+",");
//                    }
//
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//            for (int[] doubles : r) {
//                for (int aDouble : doubles) {
//                    System.out.print(aDouble+",");
//                }
//                System.out.println("");
//            }
//            System.out.println("===================================");
//        }
//
//    }


}