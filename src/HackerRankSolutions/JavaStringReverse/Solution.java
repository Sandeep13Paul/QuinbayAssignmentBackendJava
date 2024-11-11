package HackerRankSolutions.JavaStringReverse;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch;
        StringBuilder rev = new StringBuilder();
        A = A.toLowerCase();
        if(A.length() < 50) {
            int i;
            for(i = 0; i < A.length(); i++) {
                ch = A.charAt(i);
                rev.insert(0, ch);
            }
            if((rev.toString().trim()).equals(A)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}