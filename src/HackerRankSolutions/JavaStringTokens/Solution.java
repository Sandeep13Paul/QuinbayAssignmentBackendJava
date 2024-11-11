package HackerRankSolutions.JavaStringTokens;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                if (!word.isEmpty()) list.add(word);
                word = "";
            }
            else {
                word = word + ch;
            }
        }

        if (!word.isEmpty()) list.add(word);

        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }
        scan.close();
    }
}

