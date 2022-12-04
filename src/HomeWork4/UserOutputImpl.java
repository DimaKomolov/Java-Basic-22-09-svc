package HomeWork4;

import java.util.Scanner;
public class UserOutputImpl implements UserOutput {
    public int answer(String[] answerOption, int correctAnswer) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (b <= answerOption.length) {
                    break;
                } else {
                    System.out.println("Большое число");
                }
            } else {
                System.out.println("Введено не число");
                scanner.next();
            }
        }
        return correctAnswer;
    }
}