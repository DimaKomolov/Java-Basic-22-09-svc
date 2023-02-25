package HomeWork4;
    import java.util.Scanner;

    public class ConsoleUserInput implements UserInput{
        private final  UserOutput userOutput = new ConsoleUserOutput();

        @Override
        public int read(int maxValue) {
            int b = 0;
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    if (b <= maxValue) {
                        break;
                    } else {
                        userOutput.print("такого числа нет");
                    }
                } else {
                    userOutput.print("Введено не число");
                    scanner.next();
                }
            }
            return b;
        }
    }

