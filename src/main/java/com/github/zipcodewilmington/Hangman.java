package com.github.zipcodewilmington;
import java.util.Scanner;

/**
 * @author Angelika
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
//Word Guess class
public static class Wordguess {

     String guessWords;
     int tries = 0;

    public static void Wordgues(String guessWords, int tries) {
        this.guessWords = guessWords;
        this.tries = tries;


// array of random words the game asks player to guess
        String[] guessWords = { "Lawnmower", "Refrigerator", "Toaster", "Blender", "Ladder", "Vacuum"};

    }

    public static void main(String[] args) {
    Wordguess game = new Wordguess();
     game.Gameplay();
    }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play a game?");
        System.out.println("(Y/N)?");
        System.out.print("Choose: ");
        String answer = scanner.nextLine();

          // if player chooses yes or no
         if (answer.equalsIgnoreCase("Y")){

             System.out.println ("````` Hangman Deluxe v 1.0 ````");
         } else {
             System.out.println ("You thought you had a choice?");

         }
           System.out.println("````` Hangman Deluxe v 1.0 ````");

    }
// Gameplay
    public static void Gameplay(){

    }
