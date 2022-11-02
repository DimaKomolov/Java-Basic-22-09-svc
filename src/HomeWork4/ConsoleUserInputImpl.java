package HomeWork4;
import java.util.Scanner;
public class ConsoleUserInputImpl implements UserInput {
    public int ask(int maxValue) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (b <= maxValue) {
                    break;
                } else {
                    System.out.println("Большое число");
                }
            } else {
                System.out.println("Введено не число");
                scanner.next();
            }
        }
        return b;
    }
}