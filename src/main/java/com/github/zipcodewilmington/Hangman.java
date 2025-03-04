package com.github.zipcodewilmington;
import java.util.Scanner;

/**
 * @author Angelika
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
//Word Guess class
public static class Hangman {

//static Scanner input;

    public static void main(String[] args) {
        Gameplay game = new Gameplay();
        game.runGame();
    }
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
    game.player_lost(); */



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








