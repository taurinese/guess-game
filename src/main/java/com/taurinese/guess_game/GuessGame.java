package com.taurinese.guess_game;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        while(true){
            // Choose to start game or exit it
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to start game or 2 to exit game");
            int state = scanner.nextInt();
            if(state == 2) break;
            // Game starts now
            NumberToGuess numberToGuess = new NumberToGuess();
            System.out.println("Value : " + numberToGuess.value);
            // Loop to see if player wins or not
            while(true){
                System.out.println("Enter your guess and press enter");
                int userGuess = scanner.nextInt();
                if(numberToGuess.value == userGuess ) break;
            }
            System.out.println("Congrats you won this game!");
            // Loop to start game again or exit
        }

    }
}
