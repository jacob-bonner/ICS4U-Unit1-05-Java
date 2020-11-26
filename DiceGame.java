/*
* This program is a guess the number game with a random number generator.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-11-25
*/

import java.util.Scanner;  // Import the Scanner class

public class DiceGame {
  /**
   * This function is a guess the number game with a random number generator.
   */
  public static void main(String[] args) {

    // Defining the guess counter variable before it is used
    int numberOfGuesses = 0;

    try {
      // Input for the maximum range of the dice
      Scanner rangeInput = new Scanner(System.in);
      System.out.println("Enter the maximum range you would like"
                         + " for the dice (integer):");
      int range = rangeInput.nextInt();
      System.out.println();

      // Random Number
      final int randomNumber = (int) (Math.random() * (range - 1)) + 1;

      // Process
      while (true) {
        // Input for the quantity of food
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess the number between 1 and your "
                           + "specified range (integer):");
        int userGuess = guess.nextInt();
        System.out.println();

        // Guess counter
        numberOfGuesses = numberOfGuesses + 1;

        if (userGuess == randomNumber) {
          // Output if user guesses number correctly
          System.out.println("You guessed the correct number!");
          System.out.println("It took you " + numberOfGuesses + " guesses.");
          break;
        } else {
          // Output if user guesses number incorrectly
          System.out.println("Wrong number, try again!");
          System.out.println();
          System.out.println();
        }
      }

      // Catches and tells the user that an improper input was entered */
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    } 
  } 
}
