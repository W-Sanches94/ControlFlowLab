import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        // Prompt user to input a random number between 1 and 100.

        System.out.println("Feeling lucky!? Guess my secret number");
        System.out.println("Hint: its between 1 and 100");

        // generate random number.

        Random rand = new Random();
        int upperbound = 100;
        int secretInt = rand.nextInt(upperbound);
        System.out.println(secretInt);

        // use scanner to accept input.

        Scanner reader = new Scanner(System.in);
        int userGuess = Integer.parseInt(reader.nextLine());
        System.out.println("Your guess was: " + userGuess);

        //let user know if the userGuess was too high or too low.
        //set a winState boolean


        String winState = "Congratulations! You won!".toUpperCase();
        String loseState = "Please try again";


        if (userGuess == secretInt){
            System.out.println(winState);
        } else if (userGuess < secretInt) {
            System.out.println("A little too low, guess higher!");
        } else if (userGuess > secretInt) {
            System.out.println("A little too high, guess lower!");
        }




        // reject if string is input. error message "Thats not a number!"
        // reject if int is higher than 100. error message "Lower than 100 please."
        //if too high or too low, allow the user to input again.
        // win message.










    }
}
