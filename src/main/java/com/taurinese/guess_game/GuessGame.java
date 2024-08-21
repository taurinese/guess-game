package com.taurinese.guess_game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        while(true){
            // Choose to start game or exit it
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to start game, 2 to see leaderboard or 3 to exit game");
            int state = scanner.nextInt();
            if(state == 2){
                getLeaderboards();
                continue;
            }
            if(state == 3) break;
            // Game starts now
            NumberToGuess numberToGuess = new NumberToGuess();
            //System.out.println("Value : " + numberToGuess.value);
            // Loop to see if player wins or not
            int score = 100;
            while(true){
                System.out.println("Enter your guess and press enter");
                int userGuess = scanner.nextInt();
                if(numberToGuess.value == userGuess ) break;
                score--;
            }
            System.out.println("Congrats you won this game! Enter your name to save your score");
            String username = scanner.next();
            saveScore(username, score);
            // Loop to start game again or exit
        }

    }

    public static void getLeaderboards(){
        try (BufferedReader reader = new BufferedReader(new FileReader("score.txt"))) {
            String line;
            System.out.println("\nLeaderboard :");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured while displaying leaderboard.");
            e.printStackTrace();
        }
    }

    public static void saveScore(String name, int score){
        try (FileWriter writer = new FileWriter("score.txt", true)) {
            writer.write(name + ": " + score + "\n");
            System.out.println("Score saved succesfully !");
        } catch (IOException e) {
            System.out.println("An error occured while saving your score");
            e.printStackTrace();
        }
    }
}
