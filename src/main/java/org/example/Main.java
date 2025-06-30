package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int computerRandom = (int) (Math.random() * 5 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Im thinking of a number between 1 and 5.");

        for(int i = 1; i <= 3; i++){
            System.out.print("Guest " + i + ": ");
            int userGuess = scanner.nextInt();

            if (computerRandom == userGuess){
                System.out.println("You guessed it!");
                System.out.println("You Win!");
                break;
            }
            System.out.println("Wrong guess.");
        }
        System.out.println("You lose. The correct number was " + computerRandom + ".");
    }
}