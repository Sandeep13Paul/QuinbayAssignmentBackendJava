package HackerRankSolutions.JavaRegex;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
// write your code here

class MyRegex {
    // regular expression pattern to validate an IP address
    String pattern = "^([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\." +
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\." +
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\." +
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])$";
}
