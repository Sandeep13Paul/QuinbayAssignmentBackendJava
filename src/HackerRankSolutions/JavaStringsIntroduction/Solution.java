package HackerRankSolutions.JavaStringsIntroduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        A = A.toLowerCase();
        B = B.toLowerCase();
        int l1 = A.length();
        int l2 = B.length();
        int sum = l1 + l2;
        sc.close();
        System.out.println(sum);

        /* Enter your code here. Print output to STDOUT. */
        if(((int)A.charAt(0)) > ((int)B.charAt(0))) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}