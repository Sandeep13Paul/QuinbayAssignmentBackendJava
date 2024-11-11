package HackerRankSolutions.JavaComparator;

import java.util.*;

// write your Checker class here
// checker class implementing Comparator<Player>
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // primary comparison by score in descending order
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // secondary comparison by name in ascending order
        return (a.name).compareTo(b.name);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}