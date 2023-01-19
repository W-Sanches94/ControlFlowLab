import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        // Prompt user to input a random number between 1 and 100.

        System.out.println("Feeling lucky!? Guess my secret number");
        System.out.println("Hint its between 1 and 100");

        // generate random number

        Random rand = new Random();
        int upperbound = 100;
        int secretInt = rand.nextInt(upperbound);
        System.out.println(secretInt);


        // use scanner to accept input.

        Scanner reader = new Scanner(System.in);
        String userGuess = reader.nextLine();

        // reject if string is input. error message "Thats not a number!"
        // reject if int is higher than 100. error message "Lower than 100 please."
        // let user know if the number was too high or too low or correct
        //if too high or too low, allow the user to input again.
        // win message.

//        System.out.println("Feeling lucky!? Guess my secret number");
//        System.out.println("Hint its between 1 and 100");








    }
}
