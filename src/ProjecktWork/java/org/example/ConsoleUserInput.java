package org.example;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private final UserOutput userOutput = new ConsoleUserOutput();

    @Override
    public Money read(Validator[] validators) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        String cur = "";
        while (scanner.hasNext()) {
            //считывает с консоли ввод пользователя
            String input = scanner.nextLine();
            //делит строку по пробелу
            String[] strings = input.split(" "); // ["10", "Rub"]
            boolean validationResult = true;
            for (Validator validator : validators) {
                if (!validator.validate(strings)) {
                    validationResult = false;
                    break;
                }
            }
            if (!validationResult) {
                continue;
            }
            //переводит строку в число и вызывает нулевой элемент массива
            amount = Integer.parseInt(strings[0]);
            for (Validator validator : validators) {
                if (!validator.validate(amount)) {
                    validationResult = false;
                    userOutput.print( validator.messing());
                    break;
                }
            }
            if (!validationResult) {
                continue;
            }
            //вызывает первый элемент массива
            cur = strings[1];
            for (Validator validator : validators) {
                if (!validator.validate(cur)) {
                    validationResult = false;
                    userOutput.print( validator.messing());
                    break;
                }
            }
            if (!validationResult) {
                continue;
            }
            return new Money(amount, cur);
        }
        return null;

    }
}