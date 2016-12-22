package com.company;
import java.util.Scanner;

public class PVE {
    public static void PVE(int w){
        System.out.println(
                "When you are inputting your moves use these places" + "\n\n" +
                1 + " | " + 2 + " | " + 3 + "\n" + "----------" + "\n" +
                        4 + " | " + 5 + " | " + 6 + "\n" + "----------" + "\n" +
                        7 + " | " + 8 + " | " + 9 + "\n");
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
        String computer;
        if (player.equals("X")) {
            computer = "O";
        }
        else{
            computer = "X";
        }
        int fm = 0;
        do {
            switch (w) {
                case 1:
                    if(player.equals("O")) {
                        board = NoviceAI.NoviceAI(board, computer);
                        System.out.println(
                                board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                        board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                        board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        if (!WinCheck.WinCheck(board) && !WinCheck.tie) {
                            board = PlayerMove.PlayerMove(board, player);
                        }
                    }
                    else{
                        if(fm == 0) {
                            fm++;
                            System.out.println(
                                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        }
                        board = PlayerMove.PlayerMove(board, player);
                        if (!WinCheck.WinCheck(board) && !WinCheck.tie) {
                            board = NoviceAI.NoviceAI(board, computer);
                            System.out.println(
                                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        }
                    }
                    break;
                case 2:
                    if(player.equals("O")) {
                        board = IntermediateAI.IntermediateAI(board, computer);
                        System.out.println(
                                board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                        board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                        board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        if (!WinCheck.WinCheck(board) && !WinCheck.tie) {
                            board = PlayerMove.PlayerMove(board, player);
                        }
                    }
                    else{
                        if(fm == 0) {
                            fm++;
                            System.out.println(
                                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        }
                        board = PlayerMove.PlayerMove(board, player);
                        if (!WinCheck.WinCheck(board) && !WinCheck.tie) {
                            board = IntermediateAI.IntermediateAI(board, computer);
                            System.out.println(
                                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        }
                    }
                    break;
                case 3:
                    if(player.equals("O")) {
                        board = ExpertAI.ExpertAI(board, computer);
                        System.out.println(
                                board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                        board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                        board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        if (!WinCheck.WinCheck(board) && !WinCheck.tie) {
                            board = PlayerMove.PlayerMove(board, player);
                        }
                    }
                    else{
                        if(fm == 0) {
                            fm++;
                            System.out.println(
                                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        }
                        board = PlayerMove.PlayerMove(board, player);
                        if (!WinCheck.WinCheck(board) && !WinCheck.tie) {
                            board = ExpertAI.ExpertAI(board, computer);
                            System.out.println(
                                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
                        }
                    }
                    break;
            }
        }while(!WinCheck.WinCheck(board) && !WinCheck.tie);
        System.out.println(
                board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
        if(WinCheck.tie)
            System.out.println("It was a tie!");
        else {
            System.out.println(WinCheck.winner + " has won Tic-Tac-Toe!");
        }
    }
}
