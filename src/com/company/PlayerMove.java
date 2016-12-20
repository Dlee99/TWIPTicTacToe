package com.company;
import java.util.*;
public class PlayerMove {
    public static String[][] PlayerMove(String[][] a, String b){
        Scanner sc = new Scanner(System.in);
        String[][] aa = a;
        int u;
        int i = 0;
        do {
            try {
                u = 0;
                i = sc.nextInt();
            } catch (InputMismatchException e) {
                u = 1;
                System.out.println("Please input an integer 1 to 9.");
            }
            if(i < 1 || i > 9){
                System.out.println("Please input an integer 1 to 9.");
                u = 1;
            }
            i = i - 1;
            int i1 = i % 3, i2 = i / 3 ;
            if(!a[i1][i2].equals(" ")){
                System.out.println("That space is not empty.  Please input a new one.");
                u = 1;
            }
            else{
                aa[i1][i2] = b;
            }
        }while(u == 1);
        return aa;
    }
}
