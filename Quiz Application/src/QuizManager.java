import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {

    private ArrayList<Question> questions;

    public QuizManager() {

        questions = new ArrayList<>();

        questions.add(
                new Question(
                        "What is the capital of India?",
                        new String[]{
                                "Mumbai",
                                "Delhi",
                                "Chennai",
                                "Hyderabad"},
                        2));

        questions.add(
                new Question(
                        "Which language is used for Android Development?",
                        new String[]{
                                "Java",
                                "Python",
                                "C",
                                "PHP"},
                        1));

        questions.add(
                new Question(
                        "Which company developed Java?",
                        new String[]{
                                "Microsoft",
                                "Apple",
                                "Sun Microsystems",
                                "Google"},
                        3));
    }

    public int startQuiz() {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        for (Question question : questions) {

            System.out.println("\n" +
                    question.getQuestion());

            String[] options =
                    question.getOptions();

            for (int i = 0;
                 i < options.length;
                 i++) {

                System.out.println(
                        (i + 1)
                                + ". "
                                + options[i]);
            }

            System.out.print(
                    "Enter Answer: ");

            int answer =
                    sc.nextInt();

            if (answer ==
                    question.getCorrectAnswer()) {

                score++;
            }
        }

        return score;
    }

    public int getTotalQuestions() {

        return questions.size();
    }
}