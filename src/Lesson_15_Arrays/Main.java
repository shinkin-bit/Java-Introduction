package Lesson_15_Arrays;

public class Main {
    public static void main(String[] args) {
        /* ARRAYS */
        // When you need multiple elements that are loopable!

        String question1 = "What does WWW stand for?";
        String question2 = "What is the world's largest ocean";
        String question3 = "What year was Vurp! made?";

        String answer1 = "World Wide Web";
        String answer2 = "Pacific Ocean";
        String answer3 = "2024";

        // Add a fourth one...
        // Add another 15!...
        // Now LOOP through them!

        for(int i = 1; i < 4; i++) {
            // System.out.println(question1); // THIS DOES NOT WORK
        }

        /* ARRAYS */
        // Think of it as a "list" of elements
        // Programmers begin counting at 0
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the world's largest ocean";
        questions[2] = "What year was Vurp! made?";
        questions[3] = "What is KailoSparks old username";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "2024";
        answers[3] = "kiloir456montano";

        for(int i = 0; i < questions.length; i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);

            // You cannot dynamically change the size of an array!
        }

        // INTEGER ARRAY

        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 15;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // BOOLEAN  & STRING ARRAY

        boolean[] verdict = new boolean[5];
        verdict[0] = false;
        verdict[1] = true;
        verdict[2] = true;
        verdict[3] = false;
        verdict[4] = true;

        String[] statements = new String[5];
        statements[0] = "Apples are purple";
        statements[1] = "Tessa supports gleebo";
        statements[2] = "Swagmode on";
        statements[3] = "KailoSparks found the pirate token";
        statements[4] = "You've been Bazinga'd";

        for (int i = 0; i < statements.length; i++) {
            System.out.println(statements[i] + " | " + verdict[i]);
        }

    }
}
