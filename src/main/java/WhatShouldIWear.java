import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        // Prompt User on: Weather and Temperature.

        System.out.println("What words would describe the weather today?");
        System.out.println("sunny, cloudy, rainy, snowy");

        Scanner reader1 = new Scanner(System.in);
        String userWeather = reader1.nextLine();




        System.out.println("what is the average temperature for the day?");
        System.out.println("please enter a value between -10 and 30 degrees.");

        Scanner reader2 = new Scanner(System.in);
        int userTemperature = Integer.parseInt(reader2.nextLine());



        // allow users to input data.

        // return suggestion.

        System.out.println("The weather is looking " + userWeather + "and the temperature seems to be around " + userTemperature + "\u00B0");
    }
}
