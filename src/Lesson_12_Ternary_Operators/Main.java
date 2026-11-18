package Lesson_12_Ternary_Operators;

public class Main {
    public static void main(String[] args) {
    /* TERNARY OPERATORS */
        // A very "compact" way to do if-else

        int health = 0;
        String status = "";
        System.out.println("What is your status?" + status);

        if (health > 0) {
            status = "Alive";
        } else {
            status = "Non-Alive";
        }
        System.out.println("What is your Status? " + status);
        status = "";

        // TERNARY OPERATOR
        // BOOLEAN ? TRUE_RETURN : FALSE_RETURN

        status = (health > 0) ? "Alive" : "Non-Alive";
        System.out.println("What is your status?: " + status);

    }
}
