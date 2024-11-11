package HackerRankSolutions.JavaBigInteger;

import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();

        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        System.out.println(sum);
        System.out.println(product);
    }
}
