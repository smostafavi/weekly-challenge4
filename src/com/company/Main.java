package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Scanner.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// scanner to get users input

        //System.out.println("Good morning, How are you feeling today?");
        //String answer = userinput.nextLine();// getting the user input from the scanner class and saving it into answer variable


        String feeling, returnRaven;
        boolean quit = true;
        ArrayList<String> ravensResponse = new ArrayList<String>();

        String[] positivearray = new String[]{"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

        String[] negativearray = new String[]{"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

        //Creating a varialble called start phrase

        String startphrase = "Good Morning, How are you feeling today? Press Q to Quit";// creating variable for  Ravens response

        System.out.println(startphrase);

        while (quit) {

            feeling = input.nextLine();
            if (feeling.equalsIgnoreCase("Q")) {
                quit = false;

                System.out.println("returnRaven");
//creating a variable for return Raven
                returnRaven = ravensResponse(feeling, positivearray, negativearray);
                ravensResponse.add("User: " + feeling);
                ravensResponse.add("Raven: " + returnRaven);

            }
        }

        for (String x : ravensResponse) {
            System.out.println(x);
        }
    }
    //creating a method

    public static String ravensResponse(String feeling, String[] positivearray, String[] negativearray) {
        int counterpos = 0;
        int counterneg = 0;

        for (int i = 0; i < positivearray.length; i++) {
            if (feeling.contains(positivearray[i])) {
                counterpos++;
            }
            if (feeling.contains(negativearray[i])) {
                counterneg++;
            }

        }

        if (counterpos > counterneg) {
            return "I am happy for you";
        } else if (counterneg > counterpos) {
            return "I am sorry";
        } else {
            return "Meh";
        }


    }
}