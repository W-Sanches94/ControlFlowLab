import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        // Prompt User on: Weather and Temperature.

        System.out.println("What word would describe the weather today?");
        System.out.println("please select from: sunny, cloudy, rainy and snowy.");

        Scanner wReader = new Scanner(System.in);
        String userWeather = wReader.nextLine();

        System.out.println("what is the average temperature for the day?");
        System.out.println("please enter a number to represent degrees.");

        Scanner tReader = new Scanner(System.in);
        int userTemperature = Integer.parseInt(tReader.nextLine());

        System.out.println("The weather is looking " + userWeather + " and the temperature seems to be around " + userTemperature + "\u00B0");

        if (userWeather.equals("sunny") && userTemperature >= 20){
            System.out.println("Its hot outside, consider short sleeves, sunglasses or a cap");
            else if (userWeather.equals("cloudy") && userTemperature >= 10)
                System.out.println("its warm outside, don't overdress and keep it cool");
                else if (userWeather.equals("rainy") || userTemperature <= 9){
                    System.out.println("Don't forget your umbrella");
                    else (userWeather.equals("snowy") || userTemperature <= 5){
                    System.out.println("Its really cold! Please take a beanie, scarf and gloves");
                }
                }
                }
            }
        }

    }
}
