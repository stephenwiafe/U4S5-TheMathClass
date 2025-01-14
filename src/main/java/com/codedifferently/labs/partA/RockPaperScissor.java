package com.codedifferently.labs.partA;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int rounds = 5;

        System.out.println("Rock,Paper,Scissors:");
        for (int i = 0; i < rounds; i++) {
            int randNum = rand.nextInt(3);
            String result;

            if (randNum == 0) {
                result = "rock";
            } else if (randNum == 1) {
                result = "paper";
            } else {
                result = "scissors";
            }
            System.out.println("Round " + (i+1) + ": " + result);
        }
    }
}