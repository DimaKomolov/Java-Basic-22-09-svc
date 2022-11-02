package HomeWork4;
public class TestElement {
    private final String  question;
    private final String[] answerOption;
    private final int correctAnswer;
    private final UserInput userInput = new ConsoleUserInputImpl();
    private final UserOutput userOutput = new ConsoleUserOutput();

    public TestElement(String question, String[] answerOption, int correctAnswer) {
        this.question = question;
        this.answerOption = answerOption;
        this.correctAnswer = correctAnswer;
    }

    public boolean ask(){
        userOutput.answer(question);
        for (int j = 0; j < answerOption.length; j++) {
            userOutput.answer(j + 1 + "." + answerOption[j]);
        }
        userOutput.answer("Введите число");


       int userAnswer = userInput.ask(answerOption.length);
       return userAnswer == correctAnswer;
    }
}
