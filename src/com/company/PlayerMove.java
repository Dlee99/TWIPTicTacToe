package com.company;
import java.util.*;
public class PlayerMove {
    public static String[][] PlayerMove(String[][] a, String b){
        Scanner sc = new Scanner(System.in);
        String[][] aa = a;
        int u;
        int i = 0;
        do {
            while(true) {
                System.out.print("Slot: ");
                if (sc.hasNextInt()) {
                    i = sc.nextInt();
                    break;
                } else {
                    sc.next();
                    System.out.println("Please input an integer 1 to 9.");
                }
            }
            u = 0;
            i--;
            int i1 = i % 3, i2 = i / 3 ;
            if (i < 0 || i > 8) {
                System.out.println("Please input an integer 1 to 9.");
                u = 1;
            }
            else if(!a[i1][i2].equals(" ")){
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
