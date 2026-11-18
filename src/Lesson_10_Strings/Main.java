package Lesson_10_Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* STRING AND STRING METHODS */

        String name = "Shinkin";
        String occupation = "Youtube";
        occupation += "r";

        System.out.println("My name is " + name + " and I am a " + occupation);

        String sentence = "Hello, how are you doing?";
        System.out.println(sentence);

        // Upper Case & Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does it contain \"are\": " + sentence.contains("are"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy, Howdy"));

        // charAt --> Programmers start count at 0
        System.out.println(sentence.charAt(8));

        // sentence itself is not modified
        System.out.println(sentence);

        System.out.println("-------------");

        // Think back string comparisons!
        System.out.println("What is your name?: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(input == "Shinkin") {
            System.out.println("Yep, it's Shinkin with ==");
        } else {
            System.out.println("Nope, it's not Shinkin with ==");
        }

        if (input.equals("Shinkin")) {
            System.out.println("Yep, it's Shinkin with equals");
        } else {
            System.out.println("Nope, it's not Shinkin with equals");
        }

        System.out.println("-------------");
    }
}