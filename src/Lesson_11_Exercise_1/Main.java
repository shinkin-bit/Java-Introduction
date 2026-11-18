package Lesson_11_Exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1a: Easy Calculator
         *
         * Create a Calculator that runs once.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * REMEMBER: that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something"); and not ==
         *
         * After the result has been output the program ends!
         * Estimated Time: 30-45 minutes
         *
         */

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("What will your first number be?: ");
        int firstNum = scanner1.nextInt();
        System.out.println("Your first number is " + firstNum );

        System.out.println("What will your second number be?: ");
        int secondNum = scanner1.nextInt();
        System.out.println("Your second number is " + secondNum);

        System.out.println("What operation would you like to perform with your chosen numbers?: ");
        String operation = scanner1.next();
        switch (operation) {
            case "addition": System.out.println("Your final number is " + (firstNum + secondNum)); break;
            case "multiplication":  System.out.println("Your final number is " + (firstNum * secondNum)); break;
            case "division":  System.out.println("Your final number is " + (firstNum / secondNum)); break;
            case "subtraction": System.out.println("Your final number is " + (firstNum - secondNum)); break;
            default: System.out.println("bruhhh I didn't code that one try something else next time"); break;
        }





        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. Is the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
         * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         *
         */

        System.out.println("Welcome to the Vurp! Quarry Hole");

        int min = 1;
        int max = 3;
        int correctMineScore = 0;
        Scanner scanner = new Scanner(System.in);
        String ToolChoice;
        int toolChoiceID;


        // FIRST MINE
        int RandomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (RandomBlock) {
            case 1: System.out.println("You found a Stone Block!"); break;
            case 2: System.out.println("You found a Clay Block!"); break;
            case 3: System.out.println("You found a Wood Block!"); break;
        }

        System.out.println("What tool do you want to use to break this block?: Pickaxe, Shovel, or Axe?");
        ToolChoice = scanner.next().toLowerCase();

        switch (ToolChoice) {
            case "pickaxe": toolChoiceID = 1; break;
            case "shovel": toolChoiceID = 2; break;
            case "axe": toolChoiceID = 3; break;
            default: System.out.println( ToolChoice + "Is not a possible tool!"); return;
        }

        boolean CorrectMine = RandomBlock == 1 && toolChoiceID == 1 || RandomBlock == 2 && toolChoiceID == 2 || RandomBlock == 3 && toolChoiceID == 3;
        if (CorrectMine) {
            correctMineScore++;
            System.out.println("Correct!");
        } else { System.out.println("Wrong tool used, you didn't collect the block!");

        }

        // SECOND MINE
        int RandomBlock2 = (int) (Math.random() * (max - min + 1)) + min;
        switch (RandomBlock2) {
            case 1: System.out.println("You found a Stone Block!"); break;
            case 2: System.out.println("You found a Clay Block!"); break;
            case 3: System.out.println("You found a Wood Block!"); break;
        }

        System.out.println("What tool do you want to use to break this block?: Pickaxe, Shovel, or Axe?");
        ToolChoice = scanner.next().toLowerCase();

        switch (ToolChoice) {
            case "pickaxe": toolChoiceID = 1; break;
            case "shovel": toolChoiceID = 2; break;
            case "axe": toolChoiceID = 3; break;
            default: System.out.println( ToolChoice + "Is not a possible tool!"); return;
        }

        boolean CorrectMine2 = RandomBlock2 == 1 && toolChoiceID == 1 || RandomBlock2 == 2 && toolChoiceID == 2 || RandomBlock2 == 3 && toolChoiceID == 3;
        if (CorrectMine2) {
            correctMineScore++;
            System.out.println("Correct!");
        } else { System.out.println("Wrong tool used, you didn't collect the block!");

        }

        // THIRD MINE
        int RandomBlock3 = (int) (Math.random() * (max - min + 1)) + min;
        switch (RandomBlock3) {
            case 1: System.out.println("You found a Stone Block!"); break;
            case 2: System.out.println("You found a Clay Block!"); break;
            case 3: System.out.println("You found a Wood Block!"); break;
        }

        System.out.println("What tool do you want to use to break this block?: Pickaxe, Shovel, or Axe?");
        ToolChoice = scanner.next().toLowerCase();

        switch (ToolChoice) {
            case "pickaxe": toolChoiceID = 1; break;
            case "shovel": toolChoiceID = 2; break;
            case "axe": toolChoiceID = 3; break;
            default: System.out.println( ToolChoice + "Is not a possible tool!"); return;
        }

        boolean CorrectMine3 = RandomBlock3 == 1 && toolChoiceID == 1 || RandomBlock3 == 2 && toolChoiceID == 2 || RandomBlock3 == 3 && toolChoiceID == 3;
        if (CorrectMine3) {
            correctMineScore++;
            System.out.println("Correct!");
        } else { System.out.println("Wrong tool used, you didn't collect the block!");

        }
        System.out.println("Your final score is... " + correctMineScore + "!");

        // LEARNING NOTE: You had to rename "CorrectMine" and "RandomBlock" variables to different things because you needed to call on those variables multiple times.
        // In the future, you can reduce redundancy by defining the variable, but assigning the value after, like this:
        /* int randomBlock;
           randomBlock = (int) (Math.random() * (max - min + 1 )) + min
        // This will allow you to call the randomBlock variable multiple times without needing to rename the variable for using it multiple times
         */

        }


}