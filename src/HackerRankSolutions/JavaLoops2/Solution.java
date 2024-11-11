package HackerRankSolutions.JavaLoops2;

import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i, j, k;
        for(i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum = 0;
            for(k = 1; k <= n; k++) {
                sum = 0;
                for(j = 1; j <= k; j++) {
                    sum = sum + (Math.pow(2, (j - 1)) * b);
                }
                sum = sum + a;
                System.out.print((int)sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
