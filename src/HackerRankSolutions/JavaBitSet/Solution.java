package HackerRankSolutions.JavaBitSet;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // size of the BitSets
        int m = in.nextInt(); // number of operations

        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = in.next();
            int first = in.nextInt();
            int second = in.nextInt();

            switch (operation) {
                case "AND":
                    if (first == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (first == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (first == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (first == 1) {
                        B1.flip(second);
                    } else {
                        B2.flip(second);
                    }
                    break;
                case "SET":
                    if (first == 1) {
                        B1.set(second);
                    } else {
                        B2.set(second);
                    }
                    break;
            }

            // print the number of set bits in B1 and B2
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        in.close();
    }
}
