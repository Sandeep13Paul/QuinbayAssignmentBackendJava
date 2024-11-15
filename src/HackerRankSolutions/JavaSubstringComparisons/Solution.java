package HackerRankSolutions.JavaSubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String str, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String smallest = str.substring(0, k);
        String largest = str.substring(0, k);

        for (int i = 1; i < str.length() - k + 1; i++) {
            String sub = str.substring(i, i + k);

            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }

            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}