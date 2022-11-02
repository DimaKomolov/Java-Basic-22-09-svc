package HomeWork4;

import java.util.Scanner;

public class TestElement {
    private final String  question;
    private final String[] answerOption;
    private final int correctAnswer;

    public TestElement(String question, String[] answerOption, int correctAnswer) {
        this.question = question;
        this.answerOption = answerOption;
        this.correctAnswer = correctAnswer;
    }
    public boolean ask(){
        Scanner scanner = new Scanner(System.in);
        UserInputImpl userInput = new UserInputImpl();
        userInput.ask(question,answerOption);

       UserOutputImpl userOutput = new UserOutputImpl();
       int userAnswer = userOutput.answer(answerOption,correctAnswer);
       return userAnswer == correctAnswer;
    }
}
