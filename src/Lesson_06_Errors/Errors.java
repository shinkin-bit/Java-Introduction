package Lesson_06_Errors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Errors {
    public static void main(String[] args) {
        /* ERRORS */
        // NEVER FEAR ERRORS --> They are normal: FEEDBACK!

        /* Compiler Lesson_06_Errors.Errors (Syntax Lesson_06_Errors.Errors) */
        // Lesson_06_Errors.Errors that are shown before you run the Program

        // int x = 0.0; // Error of incompatible type
        // int x = 0;

        // int z = 0; // Error: Expected semicolon ;

        /* Runtime Lesson_06_Errors.Errors (Exceptions) */
        // Lesson_06_Errors.Errors that happen during the program!

        // float y = 1 / 0; // Exception: Divide by 0

        /* Exception: NullPointerException */

        // String text = null;
        // System.out.println("Our Text is " + text);

        // int length = text.length();
        // System.out.println("The Length of the text is " + length);

        /* FAIL LOUDLY --> THIS MEANS there is something to FIX! */
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter anything but a number, that's gonna throw an error!");
        // int number = scanner.nextInt();
        //System.out.println("You just typed " + number);
    }
}