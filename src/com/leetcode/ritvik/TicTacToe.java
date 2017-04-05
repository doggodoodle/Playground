package com.leetcode.ritvik;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by u6023478 on 2/27/2017.
 */
public class TicTacToe {

    final int n;

    class Player{
        @Override
        public String toString() {
            return "Player{" +
                    "cCount=" + Arrays.toString(cCount) +
                    ", rCount=" + Arrays.toString(rCount) +
                    ", fDiagCount=" + fDiagCount +
                    ", bDiagCount=" + bDiagCount +
                    '}';
        }

        int[] cCount;
        int[] rCount;
        int fDiagCount;
        int bDiagCount;

        boolean isWinner(){
            for(int i=0; i<n; i++){
                if(cCount[i] >= n || rCount[i] >= n)
                    return true;
            }
            return (fDiagCount==n)||(bDiagCount==n);
        }

        int addMove(int x, int y){
            cCount[y]++;
            rCount[x]++;
            if(x==y)
                bDiagCount++;
            if(x+y == n-1)
                fDiagCount++;
            if(isWinner())
                return 1;
            else
                return 0;
        }

        public Player(){
            rCount = new int[n];
            cCount = new int[n];
            fDiagCount = 0;
            bDiagCount = 0;
        }
    }

    Player p1;
    Player p2;

    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.n = n;
        p1 = new Player();
        p2 = new Player();
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int res = -1;
        if(player == 1) {
            res = p1.addMove(row, col);
            System.out.println(p1.toString());
            return res;
        }
        else {
            res = p2.addMove(row, col);
            System.out.println(p2.toString());
            return res;
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(3);

        System.out.println(game.move(0,0,1));
        System.out.println(game.move(0,2,2));
        System.out.println(game.move(2,2,1));
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */