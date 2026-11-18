package Lesson_14_Loops;

public class Main {
    public static void main(String[] args) {
        /* LOOPS (FOR & WHILE) */
        // Doing things multiple times (easily)
        // Doing things multiple times (easily)
        // Doing things multiple times (easily)

        // TASK: Output all numbers from 0 to 99

        // Unoptimal Way:
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        // Now output the numbers between 1000 and 2000, only leap years!
        System.out.println(1000);
        System.out.println(1004);
        System.out.println(1008);

        /* FOR LOOP */
        // for(Intitialization; Condition; Update) // if the condition is false, that's when the loop stops

        // example: Output 0-99
        // we can use integers!
        int countTo = 100;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        // Example: Leap Year filters
        for (int i = 100; i <= 2000; i++) {
            // If the year is divisible by 4 AND (it's not divisible by  100 OR it IS divisible by 400)
            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0));
            System.out.println(i);
        }


        /* WHILE LOOPS */
        int health = 10;
        while (health > 0) {
            System.out.println("The player is still alive with " + health + " HP");
            health--;
        }

        System.out.println("------------------");

        // CAUTION for While Loops
        // They can cause: Infinite Loops. Use certain keywords to prevent this!
        health = 10;
        while (health > 0) {
            if (health == 6) {
                health--;
                continue; // Skips the rest of the loop!
            }
            if (health == 2) {
                break; // exit and break out of the loop!
            }
            System.out.println("The player is still alive with" + health + " HP");
            health--;



        }




    }
}
