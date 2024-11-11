package HackerRankSolutions.Java2DArray;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Solution {

    public static int hourglassSum(List<List<Integer>> arr, int row, int col) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int top = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int mid = arr.get(i + 1).get(j + 1);
                int bottom = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int hourglass = top + mid + bottom;

                if (hourglass > maxSum) {
                    maxSum = hourglass;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = hourglassSum(arr, arr.size(), arr.getFirst().size());
        System.out.println(result);

        bufferedReader.close();
    }
}
