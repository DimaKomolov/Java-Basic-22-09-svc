package HomeWork4;
<<<<<<< HEAD
=======

import java.util.Scanner;

>>>>>>> origin/HomeWork4
public class TestElement {
    private final String  question;
    private final String[] answerOption;
    private final int correctAnswer;
<<<<<<< HEAD
    private final UserInput userInput = new ConsoleUserInputImpl();
    private final UserOutput userOutput = new ConsoleUserOutput();
=======
>>>>>>> origin/HomeWork4

    public TestElement(String question, String[] answerOption, int correctAnswer) {
        this.question = question;
        this.answerOption = answerOption;
        this.correctAnswer = correctAnswer;
    }
<<<<<<< HEAD

    public boolean ask(){
        userOutput.answer(question);
        for (int j = 0; j < answerOption.length; j++) {
            userOutput.answer(j + 1 + "." + answerOption[j]);
        }
        userOutput.answer("Введите число");


       int userAnswer = userInput.ask(answerOption.length);
=======
    public boolean ask(){
        Scanner scanner = new Scanner(System.in);
        UserInputImpl userInput = new UserInputImpl();
        userInput.ask(question,answerOption);

       UserOutputImpl userOutput = new UserOutputImpl();
       int userAnswer = userOutput.answer(answerOption,correctAnswer);
>>>>>>> origin/HomeWork4
       return userAnswer == correctAnswer;
    }
}
