package Lesson_13_Casting;

public class Main {
    public static void main(String[] args) {
        /* (BASIC) CASTING */
        // Turning one Data Type into another

        int health = 10;
        float damage = 1.5f;

        // int result = health - damage; // 10 - 1.5 = 8.5 (DOES NOT WORK WITH INTEGERS).
        float resultFloat = health - damage; // This works because it's a float!
        System.out.println("Result: " + resultFloat ); // results in 8.5

        // 10 can be turned into a float
        // 1.5 can't be turned into an int because of potential DATA LOSS

        int resultInt = health - (int)damage; // EXPLICIT CASTING. we specified that we want an INT with damage
        System.out.println("Result (int): " + resultInt ); // 9
        resultFloat = (float)health - damage; // 10 --> 10.0

        // When a floating point number get turned into an integer. everything past the first decimal point will be dropped.

        resultInt = (int)((float)health - damage); // 8.5 into an int --> 8
        System.out.println("Result: " + resultInt);

        // resultInt = (boolean)health; // Will not work because an int cant be cast into a boolean

        String points = "100";
        String pi = "3.14159265";

        int result = Integer.parseInt(points); // This will get us an integer as long as the entry of the String variable is a valid integer (A number)
        System.out.println("Result: " + resultInt);
    }
}
