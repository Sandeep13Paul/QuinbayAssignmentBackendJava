package HackerRankSolutions.JavaExceptionHandlingTryCatch;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        try {
            int a = in.nextInt();  // read the first integer
            int b = in.nextInt();  // read the second integer

            // perform division and output result
            System.out.println(a / b);  // this will throw ArithmeticException if b is 0

        } catch (InputMismatchException e) {
            // this will catch invalid input
            System.out.println("java.util.InputMismatchException");

        } catch (ArithmeticException e) {
            // this will catch division by zero
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

        in.close();
    }
}
