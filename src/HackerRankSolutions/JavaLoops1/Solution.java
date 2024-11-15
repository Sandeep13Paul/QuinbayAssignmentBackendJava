package HackerRankSolutions.JavaLoops1;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int p = 1;
        for(int i = 1; i <= 10; i++) {
            p = N * i;
            System.out.printf("%d x %d = %d\n",N ,i ,p);
        }
    }
}
