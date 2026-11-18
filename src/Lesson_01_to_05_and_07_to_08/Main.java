package Lesson_01_to_05_and_07_to_08;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* JAVA BASIC SYNTAX */

        // Testing out commenting
        /* testing out multiline comments
        * cool
        * cool
        * cool
         */

        /* Variables */

        /* Variables - Similar to a "box" of data
        * creating a new variable will require:
        * the type of data 'datatype'
        * the name of the variable 'name_of_variable'
        * end in a semicolon
        * Altogether, this creates a DECLARATION
         */

        // datatype name_of_variable; // Declaration
        // OR
        // datatype name_of_variable = value_of_variable; // Initialization (Declaration + Assignment of Value)

        // int points;     // Declaration
        // points = 100;   // Assignment
        // int c = -69;    // Initialization (Declaration + Assignment)

        // BOOLEANS
        // Can only have 2 states: True or False
        // boolean EnabledNether = true;
        // boolean EnabledEnd = false;

        // CHARS & STRINGS
        /* Char (stands for Character) can only have 1 character
        * String is multiple characters
         */

        // char Class = 'A';
        // String name = "Shinkin makes a mod";

        // Every instruction/line ends with a semicolon ;
        // This is like a period at the end of a sentence .


        /* INPUT & OUTPUT */

        /* OUTPUT */
        // you can auto write out "System.out.println()" if you just type 'sout' and press TAB
        // Strings are mainly outputted
        // System.out.println("Hello World! This is our first output!");

        // Values
        // int life = 42;
        // System.out.println(life);

        // Values and string
        // int grade = 85;
        // System.out.println("Your Grade is " + grade);

        /* INPUT */
        // ! ARCHIVING, but these lines are meant to understand how to input new read data with the 'scanner' util command
        /* Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // HAS TO BE A NUMBER!
        System.out.println("You just typed " + number);

        String input = scanner.next();
        System.out.println("You just typed (String): " + input);
         */

        /* INTEGERS & MATH */

        // int a = 100;
        // int b = 200;

        /* ADDITION */
        // int sum = a + b;
        // System.out.println("Sum: " + sum);

        // sum = 50;
        // System.out.println("Sum: " + sum);

        /* SUBTRACTION */
        // int sub = a - b;
        // System.out.println("Subtraction: " + sub);

        /* MULTIPLICATION */
        // int multi = a * b;
        // System.out.println("Multiplication: " + multi);

        /* DIVISION */
        // int division = a / b;
        // System.out.println("Division: " + division);

        // double x = 100;
        // double y = 200;
        // double doubleDivision = x / y ;
        // System.out.println("Double Division: " + doubleDivision);

        /* REMAINDER (MODULO) */
        // What this does is it divides 100 by 2 and sees what is remaining
        // int remainder = 100 % 2;
        // System.out.println("Remaining from 100 / 2: " + remainder);

        // remainder = 100 % 3;
        // System.out.println("Remaining from 100 / 3: " + remainder);

        // remainder = 100 % 4;
        // System.out.println("Remaining from 100 / 4: " + remainder);

        /* MATH METHODS */
        // We're rounding and should result in 6.4 being 6, the following duplicate entries are testing other rounding numbers
        // System.out.println("Rounding " + Math.round(6.4));          // Output: 6
        // System.out.println("Rounding Down " + Math.floor(500.2f));      // Output: 6
        // System.out.println("Rounding Up " + Math.ceil(6.4));         // Output: 7
        // System.out.println("Exponent " + Math.pow(2, 3));            // Output: 2^3 = 8

        /* RANDOM NUMBERS */
         System.out.println("Random Number between 0 - 10: " + Math.random() * 10);
         System.out.println("Random Number between 0 - 10: " + Math.round(Math.random() * 10));

        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);

        // ADDITION +=

        // !using the command "mana+=" will add whatever amount onto the current amount
        mana += 20; // mana = mana+20
        System.out.println("Mana: " + mana);

        // !using the command "mana++;" will increase mana by 1 // known as an INCREMENT

        mana++;
        System.out.println("Mana: " + mana);

        // SUBTRACTION- -=

        mana--; // mana = mana - 1 // Known as a DECREMENT
        System.out.println("Mana: " + mana);

        mana -= 60;
        System.out.println("Mana: " + mana);

        // MULTIPLICATION *=

        mana *= 2;
        System.out.println("Mana: " + mana);

        // DIVIDE /=

        mana /= 4;
        System.out.println("Mana: " + mana);

        // MODULO (REMAINDER) %=

        mana %= 2;
        System.out.println("Mana: " + mana);


        /* BOOLEANS & LOGIC */

        // Booleans are either true or false
        boolean ShinkinSwag = true;
        boolean ShinkinRich = false;
        System.out.println("Shinkin is swag " + ShinkinSwag);

        boolean isCreative = false;
        System.out.println("Player is in creative mode: " + isCreative);

        /* COMPARISON (< <= >= > == !=) */

        int swagpoints = 80;
        int pointForPassing = 55;
        boolean HasPassedTest = swagpoints >= pointForPassing;
        System.out.println("Has Shinkin become swag: " + HasPassedTest);

        int health = 10;
        boolean isAlive = health > 0; // Health = 1 TRUE, Health = 0 False
        System.out.println("Is Shinkin still alive : " + isAlive);

        // VARIABLE/VALUE comparison operator VARIABLE VALUE ==> BOOLEAN
        // int + int ==> int

        // !! BEWARE of STRINGS !!
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean isShinkin = name.equals("Shinkin"); // .equals for Strings, == for integers

        System.out.println("Is your name Shinkin?: " + isShinkin);

        /* LOGIC */
        // Think of it as "addition" and "subtraction" for Booleans

        // (BOOLEAN log BOOLEAN) ==> BOOLEAN

        // OR || ==> (a || b)
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND && ==> (a && b)
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT !
        // a | !a
        // 0 |  1
        // 1 |  0

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest2 && passedTest1;

        // Mining Example
        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = hasPickaxe && (durability >= neededDurability) || isCreative;

        /* DRINKING AGE EXAMPLE */
        System.out.println("What is your age?: ");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from Europe?: ");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEU = age >= euDrinkingAge;
        boolean couldDrinkInUS = age >= usDrinkingAge;

        boolean canPersonDrinkAlcohol = isEuropean && couldDrinkInEU || isAmerican && couldDrinkInUS;
        System.out.println("Can you drink?: " + canPersonDrinkAlcohol);
    }
}
