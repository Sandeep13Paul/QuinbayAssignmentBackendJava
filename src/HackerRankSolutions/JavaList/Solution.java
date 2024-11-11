package HackerRankSolutions.JavaList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            String str = in.next();

            if (str.equals("Insert")) {
                int a = in.nextInt();
                int b = in.nextInt();

                list.add(a, b);
            }
            else if (str.equals("Delete")) {
                int a = in.nextInt();

                list.remove(a);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        in.close();
    }
}
