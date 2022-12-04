package HomeWork4;

public class UserInputImpl implements UserInput {
    public void ask(String question, String[] answerOption) {


        System.out.println(question);
        for (int j = 0; j < answerOption.length; j++) {
            System.out.println(j + 1 + "." + answerOption[j]);
        }
        System.out.println("Введите число");
    }
}