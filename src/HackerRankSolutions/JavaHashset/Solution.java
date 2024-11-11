package HackerRankSolutions.JavaHashset;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        HashSet<String> set = new HashSet<>();
        int i = 0;
        while (i < n) {
            String str = in.nextLine();
            set.add(str);

            System.out.println(set.size());
            i++;
        }
    }
}
