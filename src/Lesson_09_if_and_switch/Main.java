package Lesson_09_if_and_switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* CONTROL FLOW (IF & SWITCH */
        // "Everything is just an if statement"
        // To "Control" the flow of the program, not just line by line

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much Health do you have?:  ");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if (isAlive) {
            System.out.println("You are still alive!");
        } else {
            System.out.println("Game Over: You have lost the game!");
        }

        System.out.println("How many points did you have in the exam?: ");
        int points = scanner.nextInt();

        if(points>= 100) {
            System.out.println("Passed with Honors");
        } else if(points >= 50) {
            System.out.println("Passed");
        } else if(points >= 25) {
            System.out.println("You failed");
        } else {
            System.out.println("You failed miserably");
        }

        /* SWITCH */
        // for explicit action for cases

        System.out.println("Give me a number between 0 and 5: ");
        int studentId = scanner.nextInt();
        switch (studentId) {
            case 0: System.out.println("Student Sarah has ID 0"); break;
            case 1: System.out.println("Student Mara has ID 1"); break;
            case 2: System.out.println("Student John has ID 2"); break;
            case 3: System.out.println("Student Boey has ID 3"); break;
            case 4: System.out.println("Student Ludwig has ID 4"); break;
            case 5: System.out.println("Student Nano has ID 5"); break;
            default: System.out.println("ERROR: Student with id " + studentId + " not found!"); break;
        }
    }
}

