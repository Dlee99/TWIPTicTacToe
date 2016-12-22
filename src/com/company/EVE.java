package com.company;
import java.util.Scanner;
public class EVE {
    public static void EVE(){
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int u = 0; u < board.length; u++){
                board[i][u] = " ";
            }
        }
        System.out.println("Would you like computer \"X\" to be a novice (1), an intermediate (2), or an expert (3)?");
        int i = 0;
        while(true) {
            System.out.print("X Difficulty: ");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                break;
            } else {
                sc.next();
                System.out.println("Please input an integer 1 to 3.");
            }
            if (i < 1 || i > 3) {
                System.out.println("Please input an integer 1 to 3.");
            }
        }
        System.out.println("Would you like computer \"O\" to be a novice (1), an intermediate (2), or an expert (3)?");
        int t = 0;
        while(true) {
            System.out.print("O Difficulty: ");
            if (sc.hasNextInt()) {
                t = sc.nextInt();
                break;
            } else {
                sc.next();
                System.out.println("Please input an integer 1 to 3.");
            }
            if (t < 1 || t > 3) {
                System.out.println("Please input an integer 1 to 3.");
            }
        }
        while(true){
            switch(i) {
                case 1: board = NoviceAI.NoviceAI(board, "X");
                    break;
                case 2: board = IntermediateAI.IntermediateAI(board, "X");
                    break;
                case 3: board = ExpertAI.ExpertAI(board, "X");
                    break;
            }
            System.out.println(
                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
            if(WinCheck.WinCheck(board) || WinCheck.tie) {
                if(WinCheck.tie)
                    System.out.println("It was a tie!");
                else {
                    System.out.println(WinCheck.winner + " has won Tic-Tac-Toe!");
                }
                break;
            }
            switch(t){
                case 1: board = NoviceAI.NoviceAI(board, "O");
                    break;
                case 2: board = IntermediateAI.IntermediateAI(board, "O");
                    break;
                case 3: board = ExpertAI.ExpertAI(board, "O");
                    break;
            }
            System.out.println(
                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
            if(WinCheck.WinCheck(board) || WinCheck.tie) {
                if(WinCheck.tie)
                    System.out.println("It was a tie!");
                else {
                    System.out.println(WinCheck.winner + " has won Tic-Tac-Toe!");
                }
                break;
            }
        }
    }
}
