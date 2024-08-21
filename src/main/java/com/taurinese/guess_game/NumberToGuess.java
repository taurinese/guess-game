package com.taurinese.guess_game;

import java.util.Random;

public class NumberToGuess {
    public int value = 0;

    public NumberToGuess() {
        Random random = new Random();
        this.value = random.nextInt(100);
    }
}
