package com.github.zipcodewilmington;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Angelika
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
//Hangman class
public class Hangman {


    public static void main(String[] args) {
        //greeting

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play a game?");
        System.out.println("(Y/N)?");
        System.out.print("Choose: ");
        // if player chooses yes or no
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("N")) {
            System.out.println("You thought you had a choice?");
            System.out.println("````` Hangman Deluxe v 1.0 ````");

        } else {
            System.out.println("````` Hangman Deluxe v 1.0 ````");
        }

        // array of random words the game asks player to guess
        String[] guessWords = {"lawnmower", "refrigerator", "toaster", "blender", "ladder", "vacuum"};

        //grabs random word from array
        String randomword = guessWords[(int) (Math.random() * guessWords.length)];

        //stores the letter player chooses
        char[] letters = new char[randomword.length()];


        int lives = 0;
        //scanner to accept user input
        //Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Input: ");

        String input = scanner.nextLine();

        char letter = input.charAt(0);

        System.out.print("Word: ");

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }

        System.out.println();





       System.out.println("Exiting game");

}

        //Gameplay game = new Gameplay();
       // game.runGame();
    }




/* hangman();
    game.Announce_game();
    game.game_over();
    game.initialize_game_state();
    game.get_next_guessed();
    game.ask_to_play_again();
    game.print_current_state();
    game.process();
    game.player_win();
    game.player_lost();



public static void hangman() {


        Scanner scanner = new Scanner(System.in);

        //words to guess from
        String[] guessWords = { "Lawnmower", "Refrigerator", "Toaster", "Blender", "Ladder", "Vacuum"};

        System.out.println("Would you like to play a game?");
        System.out.println("(Y/N)?");
        System.out.print("Choose: ");
        String answer = scanner.nextLine();

          // if player chooses yes or no
         if (answer.equalsIgnoreCase("Y")){

             System.out.println ("````` Hangman Deluxe v 1.0 ````");
         } else {
             System.out.println ("You thought you had a choice?");
             System.out.println("````` Hangman Deluxe v 1.0 ````");
         }


    }

    public static void player_lost() {
    }

    public static void player_win() {
    }

    private static void process() {
    }

    private static void print_current_state() {
    }

    private static void ask_to_play_again() {
    }

    private static void get_next_guessed() {
    }

    private static void initialize_game_state() {
    }

    private static void game_over() {
    }

    private static void Announce_game() {

    }


*/





