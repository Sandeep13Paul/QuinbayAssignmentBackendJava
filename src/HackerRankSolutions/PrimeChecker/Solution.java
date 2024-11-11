package HackerRankSolutions.PrimeChecker;

import java.io.*;

class Prime {
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void checkPrime(int... nums) {
        StringBuilder primes = new StringBuilder();
        for (int number : nums) {
            if (isPrime(number)) {
                primes.append(number).append(" ");
            }
        }

        if (!primes.isEmpty()) {
            System.out.println(primes.toString().trim());
        } else {
            System.out.println();
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
