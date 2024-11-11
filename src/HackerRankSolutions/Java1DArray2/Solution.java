package HackerRankSolutions.Java1DArray2;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // return true if you can win the game; otherwise, return false.
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game) {
        // base cases
        if (i >= game.length) {
            return true; // we've reached or gone beyond the end of the array
        }
        if (i < 0 || game[i] == 1) {
            return false; // out of bounds or cell already visited (or blocked)
        }

        // mark this cell as visited by setting it to 1
        game[i] = 1;

        // explore the three possible moves
        boolean moveForward = canWinFrom(i + 1, leap, game);
        boolean leapForward = canWinFrom(i + leap, leap, game);
        boolean moveBackward = canWinFrom(i - 1, leap, game);

        // restore the cell value for potential future explorations
        game[i] = 0;

        // return true if any of the moves leads to a win
        return moveForward || leapForward || moveBackward;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
