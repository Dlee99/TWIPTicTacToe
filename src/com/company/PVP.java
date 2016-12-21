package com.company;

import java.util.Scanner;

public class PVP {
    public static void PVP(){
        System.out.println(
                "When you are inputting your moves use these places" + "\n\n" +
                        1 + " | " + 2 + " | " + 3 + "\n" + "----------" + "\n" +
                        4 + " | " + 5 + " | " + 6 + "\n" + "----------" + "\n" +
                        7 + " | " + 8 + " | " + 9 + "\n");
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int u = 0; u < board.length; u++){
                board[i][u] = " ";
            }
        }
        String player1 = "X", player2 = "O";
        while(true){
            board = PlayerMove.PlayerMove(board, player1);
            System.out.println(
                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
            if(WinCheck.WinCheck(board))
                break;
            board = PlayerMove.PlayerMove(board, player2);
            System.out.println(
                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
            if(WinCheck.WinCheck(board))
                break;
        }
        System.out.println(
                board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                        board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                        board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
        System.out.println(WinCheck.winner + " has won Tic-Tac-Toe!");
    }
}
