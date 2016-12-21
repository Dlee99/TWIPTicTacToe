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
            System.out.println("Would you like to play against a novice (1), an intermediate (2), or an expert (3).");
            int t = 0;
            int w = 0;
            do {
                try {
                    t = 0;
                    w = sc.nextInt();
                } catch (IndexOutOfBoundsException e) {
                    w = 1;
                    System.out.println("Please input an integer 1 to 3.");
                }
                if(w < 1 || w > 3){
                    System.out.println("Please input an integer 1 to 3.");
                    t = 1;
                }
            }while(t == 1);
            PVE.PVE(w);
        }
        if (i == 3){
            EVE.EVE();
        }
    }
}