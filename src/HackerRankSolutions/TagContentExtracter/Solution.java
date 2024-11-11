package HackerRankSolutions.TagContentExtracter;

import java.util.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String line = in.nextLine();

            // write your code here
            // regex pattern to capture the tag content
            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            boolean matchFound = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
    }
}
