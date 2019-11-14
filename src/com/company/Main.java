package com.company;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Scanner.*;

public class Main {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);// scanner to get users input
        System.out.println("Good morning, How are you feeling today?");
        String answer = userinput.nextLine();// getting the user input from the scanner class and saving it into answer variable

        //Creating an array of User input

        String[] answerarray = new String[100];


        for (int j = 0; j < answerarray.length; j++)
            answerarray[j] = userinput.nextLine();


        String[] positivearray = new String[]{"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

        String[] negativearray = new String[]{"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

//public static void  equal(){


        for (int i = 0; i < positivearray.length; i++) {
            for (int j = 0; j < answerarray.length; j++) {// inner loop

                if (positivearray[i] == answerarray[j]) {

                    System.out.println("I am so happy for you...Yay");
                } else {

                    for (int k = 0; k < negativearray.length; i++) {

                        if (negativearray[k] == answerarray[j]) ;


                        System.out.println("Really!Why, tell me more");

                    }else{


                        System.out.println("Meh");

                        System.out.println("tell me more");


                    }
                }
            }
        }
    }
}









