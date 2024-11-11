package HackerRankSolutions.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        // write your code here

        // create an array to store pairs of (original string, index)
        Object[][] pairs = new Object[n][2];
        for(int i = 0; i < n; i++) {
            pairs[i][0] = s[i];
            pairs[i][1] = i;
        }

        // sort based on BigDecimal value and preserve original order for equal values
        Arrays.sort(pairs, (a, b) -> {
            BigDecimal bd1 = new BigDecimal((String)a[0]);
            BigDecimal bd2 = new BigDecimal((String)b[0]);
            int compareResult = bd2.compareTo(bd1);  // descending order

            // if values are equal, maintain original order
            if (compareResult == 0) {
                return ((Integer)a[1]).compareTo((Integer)b[1]);
            }
            return compareResult;
        });

        // copy back to original array maintaining string format
        for(int i = 0; i < n; i++) {
            s[i] = (String)pairs[i][0];
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}