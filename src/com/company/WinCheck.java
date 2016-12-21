package com.company;

public class WinCheck {
    public static String winner;
    public static boolean WinCheck(String[][] a){
        String line = "";
        for(int i = 0; i < 3; i++){
            for(int u = 0; u < 3; u++){
                line = line + a[i][u];
                if(line.equals("XXX")){
                    winner = "X";
                    return true;
                }
                else if(line.equals("OOO")){
                    winner = "O";
                    return true;
                }
            }
            line = "";
        }
        for(int u = 0; u < 3; u++){
            for(int i = 0; i < 3; i++){
                line = line + a[i][u];
                if(line.equals("XXX")){
                    winner = "X";
                    return true;
                }
                else if(line.equals("OOO")){
                    winner = "O";
                    return true;
                }
            }
            line = "";
        }
        String d1, d2;
        d1 = a[0][0] + a[1][1] + a[2][2];
        d2 = a[2][0] + a[1][1] + a[0][2];
        if(d1.equals("XXX") || d2.equals("XXX")){
            winner = "X";
            return true;
        }
        else if(d1.equals("OOO") || d2.equals("OOO")){
            winner = "O";
            return true;
        }
        return false;
    }
}
