import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        // Prompt user to input a random number between 1 and 100.

        System.out.println("Feeling lucky!? Guess my secret number");
        System.out.println("Hint: its between 1 and 100");

        // generate random number.

        Random rand = new Random();
        int secretInt = rand.nextInt(100) + 1;
        System.out.println("system's secret number: " + secretInt);

        // use scanner to accept input.

        Scanner reader = new Scanner(System.in);

        // let user know if the userGuess was too high or too low.

        while (true) {

            int userGuess = Integer.parseInt(reader.nextLine());
//             POST LAB: int userGuess = reader.nextInt(); - does not need be parsed like above, can use reader.nextInt();
            System.out.println("Your guess was: " + userGuess);

            if (userGuess == secretInt) {
                System.out.println("Congratulations! ".toUpperCase() + "Guess you really are lucky.");
                break;
            } else if (userGuess < secretInt) {
                System.out.println("A little too low, guess higher!");
            } else {
                System.out.println("A little too high, guess lower!");
            }
        }
    }
}
