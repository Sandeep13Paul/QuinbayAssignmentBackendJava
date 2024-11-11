package HackerRankSolutions.JavaDeque;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            // add the new number to deque and map
            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            // when the deque has reached the size m, check unique count
            if (deque.size() == m) {
                // calculate the current number of unique elements
                maxUnique = Math.max(maxUnique, map.size());

                // remove the element at the front of the deque
                int first = deque.removeFirst();
                int count = map.get(first);

                // update the map, removing the key if count becomes zero
                if (count == 1) {
                    map.remove(first);
                } else {
                    map.put(first, count - 1);
                }
            }
        }

        System.out.println(maxUnique);
        in.close();
    }

    // helper function to count unique elements in the deque
    private static int countUnique(Deque<Integer> deque) {
        List<Integer> list = new ArrayList<>(deque);
        int uniqueCount = 0;

        for (int i = 0; i < list.size(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}



