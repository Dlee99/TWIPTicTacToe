package com.company;

public class EVE {
    public static void EVE(){
        String[][] board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int u = 0; u < board.length; u++){
                board[i][u] = " ";
            }
        }
        String computer = "X";
        for(int i = 0; true; i++){
            if(i % 2 == 0)
                computer = "X";
            else
                computer = "O";
            board = ExpertAI.ExpertAI(board, computer);
            System.out.println(
                    board[0][0] + " | " + board[1][0] + " | " + board[2][0] + "\n" + "----------" + "\n" +
                            board[0][1] + " | " + board[1][1] + " | " + board[2][1] + "\n" + "----------" + "\n" +
                            board[0][2] + " | " + board[1][2] + " | " + board[2][2] + "\n");
            if(WinCheck.WinCheck(board))
                break;
            if(WinCheck.tie)
                break;
        }

    }
}
