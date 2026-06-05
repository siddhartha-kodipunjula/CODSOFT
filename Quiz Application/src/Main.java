public class Main {

    public static void main(String[] args) {

        System.out.println(
                "========================");
        System.out.println(
                "     QUIZ APPLICATION");
        System.out.println(
                "========================");

        QuizManager quiz =
                new QuizManager();

        int score =
                quiz.startQuiz();

        System.out.println(
                "\n===== RESULT =====");

        System.out.println(
                "Score: "
                        + score
                        + "/"
                        + quiz.getTotalQuestions());

        double percentage =
                ((double) score
                        / quiz.getTotalQuestions())
                        * 100;

        System.out.println(
                "Percentage: "
                        + percentage
                        + "%");

        if (percentage >= 70) {

            System.out.println("PASS");
        }

        else {

            System.out.println("FAIL");
        }
    }
}