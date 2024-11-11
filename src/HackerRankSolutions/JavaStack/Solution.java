package HackerRankSolutions.JavaStack;

import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str=sc.next();
            //Complete the code
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (stack.isEmpty()) {
                    stack.push(ch);
                }
                else {
                    if (stack.peek() == '(' && ch == ')') {
                        stack.pop();
                    }
                    else if (stack.peek() == '{' && ch == '}') {
                        stack.pop();
                    }
                    else if (stack.peek() == '[' && ch == ']') {
                        stack.pop();
                    }
                    else {
                        stack.push(ch);
                    }
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
        }
        sc.close();
    }
}



