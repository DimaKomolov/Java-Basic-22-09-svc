package HomeWork4;

import java.util.Arrays;

    public class TestElement {
        private final String question;
        private final String[]  answerOptions;
        private final int correctAnswers;
        private final UserInput userInput = new ConsoleUserInput();
        private final  UserOutput userOutput = new ConsoleUserOutput();

        public TestElement(String question, String[] answerOptions, int correctAnswers) {
            this.question = question;
            this.answerOptions = answerOptions;
            this.correctAnswers = correctAnswers;
        }

        public boolean test(){
            userOutput.print(question);
            for (int j = 0; j < answerOptions.length; j++) {
                userOutput.print(j+1 + "." + answerOptions[j]);
            }
            userOutput.print("Введите число");
            int userAnswer = userInput.read(answerOptions.length);

            return userAnswer == correctAnswers;

        }
    }

