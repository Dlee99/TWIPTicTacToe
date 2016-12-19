package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play versus another player (1), a computer (2), or have two computers play against each other (3)?");
        int u = 0;
        int i = 0;
        do {
            try {
                u = 0;
                i = sc.nextInt();
            } catch (InputMismatchException e) {
                u = 1;
                System.out.println("Please input an integer 1 to 3.");
            }
            if(i < 1 || i > 3){
                System.out.println("Please input an integer 1 to 3.");
                u = 1;
            }
        }while(u == 1);
        if(i == 1){
            PVP.PVP();
        }
        if (i == 2) {
            PVE.PVE();
        }
        if (i == 3){
            EVE.EVE();
        }
    }
}