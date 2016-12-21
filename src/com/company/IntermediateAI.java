package com.company;

import java.util.Random;

public class IntermediateAI {
    public static String[][] IntermediateAI(String[][] a, String b){
        String[][] board = a;
        String c1, c2, c3, c4, c5, c6;
        if(b.equals("X")) {
            c1 = "XX "; c2 = "X X"; c3 = " XX";
            c4 = "OO "; c5 = "O O"; c6 = " OO";
        }
        else{
            c1 = "OO "; c2 = "O O"; c3 = " OO";
            c4 = "XX "; c5 = "X X"; c6 = " XX";
        }
        for(int i = 0; i < board.length; i++){
            String line = "";
            for(int u = 0; u < board.length; u++){
                line = line + board[i][u];
            }
            if(line.equals(c1)){
                board[i][2] = b;
                return board;
            }
            else if(line.equals(c2)){
                board[i][1] = b;
                return board;
            }
            else if(line.equals(c3)){
                board[i][0] = b;
                return board;
            }
        }
        for(int u = 0; u < board.length; u++){
            String line = "";
            for(int i = 0; i < board.length; i++){
                line = line + board[i][u];
            }
            if(line.equals(c1)){
                board[2][u] = b;
                return board;
            }
            else if(line.equals(c2)){
                board[1][u] = b;
                return board;
            }
            else if(line.equals(c3)){
                board[0][u] = b;
                return board;
            }
        }
        String d1 = board[0][0] + board[1][1] + board[2][2];
        if(d1.equals(c1)){
            board[2][2] = b;
            return board;
        }
        else if(d1.equals(c2)){
            board[1][1] = b;
            return board;
        }
        else if(d1.equals(c3)){
            board[0][0] = b;
            return board;
        }
        String d2 = board[2][0] + board[1][1] + board[0][2];
        if(d2.equals(c1)){
            board[0][2] = b;
            return board;
        }
        else if(d2.equals(c2)){
            board[1][1] = b;
            return board;
        }
        else if(d2.equals(c3)){
            board[2][0] = b;
            return board;
        }
        for(int i = 0; i < board.length; i++){
            String line = "";
            for(int u = 0; u < board.length; u++){
                line = line + board[i][u];
            }
            if(line.equals(c4)){
                board[i][2] = b;
                return board;
            }
            else if(line.equals(c5)){
                board[i][1] = b;
                return board;
            }
            else if(line.equals(c6)){
                board[i][0] = b;
                return board;
            }
        }
        for(int u = 0; u < board.length; u++){
            String line = "";
            for(int i = 0; i < board.length; i++){
                line = line + board[i][u];
            }
            if(line.equals(c4)){
                board[2][u] = b;
                return board;
            }
            else if(line.equals(c5)){
                board[1][u] = b;
                return board;
            }
            else if(line.equals(c6)){
                board[0][u] = b;
                return board;
            }
        }
        if(d1.equals(c4)){
            board[2][2] = b;
            return board;
        }
        else if(d1.equals(c5)){
            board[1][1] = b;
            return board;
        }
        else if(d1.equals(c6)){
            board[0][0] = b;
            return board;
        }
        if(d2.equals(c4)){
            board[0][2] = b;
            return board;
        }
        else if(d2.equals(c5)){
            board[1][1] = b;
            return board;
        }
        else if(d2.equals(c6)){
            board[2][0] = b;
            return board;
        }
        else {
            Random rd = new Random();
            String[][] aa = a;
            while (0 == 0) {
                int i1 = rd.nextInt(3), i2 = rd.nextInt(3);//generate random tic-tac-toe slot
                if (a[i1][i2].equals(" ")) {
                    aa[i1][i2] = b; //put the computer's mark in that slot
                    return aa;
                }
            }
        }
    }
}
