package HackerRankSolutions.JavaSHA256;

import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        // create a MessageDigest instance for SHA-256
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

        // update the digest with the input string (converted to a byte array)
        sha256.update(input.getBytes());

        // compute the SHA-256 hash (returns a byte array)
        byte[] hashBytes = sha256.digest();

        // convert the byte array into a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            // convert each byte to a two-character hex value
            hexString.append(String.format("%02x", b));
        }

        // print the resulting SHA-256 hash
        System.out.println(hexString.toString());
    }
}
