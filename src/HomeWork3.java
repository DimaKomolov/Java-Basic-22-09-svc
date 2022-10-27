import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = new String[]{"В файл с каким расширением компилируется java-файл?", "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой применяется цикл ,когда не известно количество итераций"};
        String[][] answerOptions = new String[][]{{"cs", "java", "class", "exe"}, {"commit", "push", "clone", "copy"}, {"while", "fpr", "loop"}};
        int[] correctAnswers = new int[]{3, 3, 1};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(j + 1 + "." + answerOptions[i][j]);
            }
            System.out.println("Введите число");
            int b = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    if (b <= answerOptions[i].length) {
                        break;
                    } else {
                        System.out.println("Большое число");
                    }
                    }else{
                        System.out.println("Введено не число");
                        scanner.next();
                    }
            }
            if (b == correctAnswers[1]) {
                correctCount++;
                System.out.println("Правильно");
            } else {
                wrongCount++;
                System.out.println("Не правильно");
            }

            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }
    }
}