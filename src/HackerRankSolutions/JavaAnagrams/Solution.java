package HackerRankSolutions.JavaAnagrams;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        n = s2.length();
//        boolean flag = false; // this is used to check if character is present in the map or not
        for (int i = 0; i < n; i++) {
            char ch = s2.charAt(i);
            if (!map.containsKey(ch)) {
//                flag = true;
                break;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
