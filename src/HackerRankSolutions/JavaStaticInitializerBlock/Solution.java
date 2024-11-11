package HackerRankSolutions.JavaStaticInitializerBlock;

import java.util.*;

public class Solution {
    static int breadth;
    static int height;
    static int area;
    static boolean isValid;  //a flag to check if inputs are valid

    //static initialization block
    static {
        Scanner in = new Scanner(System.in);

        //read inputs
        breadth = in.nextInt();
        height = in.nextInt();

        //check for negative values
        if (breadth <= 0 || height <= 0) {
            isValid = false;
        }
        else {
            area = breadth * height;
            isValid = true;
        }
        in.close();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            //if inputs are invalid throw an exception
            if (!isValid) {
                throw new Exception("Breadth and height must be positive");
            }
            //if inputs are valid , print the area
            System.out.println(area);
        }
        catch (Exception e) {
            //catch the thrown exception and print its message
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }
}
