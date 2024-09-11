import java.util.Scanner;
import java.util.Random;

public class Guessing_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        String userInput;
        boolean isCorrect = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number (between 1 and 100). Type 'Q' to give up.");

        while(!isCorrect) {
            System.out.print("Enter your guess: ");
            userInput = input.nextLine();


            if(userInput.equalsIgnoreCase("Q")) {
                System.out.println("You gave up! The number was " + numberToGuess);
                break;
            }
            try {
                userGuess = Integer.parseInt(userInput);

                if(userGuess < numberToGuess) {
                    System.out.print("Too low! ");
                }
                else if(userGuess > numberToGuess) {
                    System.out.print("Too high! ");
                }
                else {
                    System.out.println("Congratulations, you guessed the right number!");
                    isCorrect = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid number or press Q to exit: ");
            }
        }
    }
}