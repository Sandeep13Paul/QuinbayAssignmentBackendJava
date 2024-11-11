package HackerRankSolutions.JavaSubarray;

import java.util.*;

public class Solution {

    public static int countNegativeSubarray(int[] arr, int n) {
        int index = 0;
        int count = 0;
        while (index < n) {
            int sum = 0;

            for (int j = index; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }

            index++;
        }

        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int result = countNegativeSubarray(arr, n);
        System.out.println(result);
    }
}
