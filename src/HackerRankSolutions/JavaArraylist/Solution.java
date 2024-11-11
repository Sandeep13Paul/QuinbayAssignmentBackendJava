package HackerRankSolutions.JavaArraylist;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
            int t = in.nextInt();
            for (int j = 0; j < t; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        int m = in.nextInt();
        int[][] query = new int[m][2];

        for (int i = 0; i < m; i++) {
            query[i][0] = in.nextInt();
            query[i][1] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = query[i][0] - 1;
            int b = query[i][1] - 1;
            if (a < list.size()) {
                if (b < list.get(a).size()) {
                    System.out.println(list.get(a).get(b));
                }
                else {
                    System.out.println("ERROR!");
                }
            }
            else {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
