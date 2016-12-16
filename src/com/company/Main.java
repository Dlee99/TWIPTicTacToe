package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

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
        Game.game(player);

    }
}