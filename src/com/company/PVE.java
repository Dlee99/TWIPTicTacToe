package com.company;

import java.util.Scanner;

/**
 * Created by dl447 on 12/19/16.
 */
public class PVE {
    public static void PVE(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play as 'X' or as 'O'?");
        String player = sc.nextLine().toUpperCase();
        while (0 == 0) {
            if (player.equals("X") || player.equals("O")) {
                break;
            } else {
                System.out.println("Sorry, this is not a proper response.");
                player = sc.nextLine().toUpperCase();
            }
        }
        String[][] board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int u = 0; u < board.length; u++){
                board[i][u] = " ";
            }
        }
        System.out.println(board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                board[0][1] + " | " + board[1][2] + " | " + board[2][2]);
    }

}
