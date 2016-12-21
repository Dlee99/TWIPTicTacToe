package com.company;
import java.util.*;
public class NoviceAI {
    public static String[][] NoviceAI(String[][] a, String b){
        Random rd = new Random();
        String[][] aa = a;
        while(0 == 0) {
            int i1 = rd.nextInt(3), i2 = rd.nextInt(3);//generate random tic-tac-toe slot
            if (a[i1][i2].equals(" ")) {
                aa[i1][i2] = b; //put the computer's mark in that slot
                return aa;
            }
            else{}
        }
    }
}
