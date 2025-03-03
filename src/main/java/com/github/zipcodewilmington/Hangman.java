package com.github.zipcodewilmington;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Angelika
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    public static void main(String[] args) {

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


}
