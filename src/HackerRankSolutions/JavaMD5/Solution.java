package HackerRankSolutions.JavaMD5;

import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        // create a MessageDigest instance for MD5
        MessageDigest md = MessageDigest.getInstance("MD5");

        // update the digest with the input string (converted to a byte array)
        md.update(input.getBytes());

        // compute the MD5 hash (returns a byte array)
        byte[] digest = md.digest();

        // convert the byte array into a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            // convert each byte to a two-character hex value
            hexString.append(String.format("%02x", b));
        }

        // print the resulting MD5 hash
        System.out.println(hexString.toString());
    }
}
