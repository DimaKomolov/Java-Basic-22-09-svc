package org.example;

import java.util.Scanner;

public class ProjectWork {

    public static void main(String[] args) throws InvalidCurrencyException {
        Scanner scanner = new Scanner(System.in);
      // String b = scanner.nextLine();
       //String[] strings = b.split(" ");

//        int amount = Integer.parseInt(strings[0]);
//        String cur =  strings[1];
//
//        System.out.println(b);
//        //1.программа запускается
//        //2.ввод пользователя число, валюта(5 rub)
//        //3.разделение на currency и amount
//        //4.выбрать окончание
//        Currency currency = Currency.getInstance(cur);
//        System.out.println(currency);
          UserInput userInput = new ConsoleUserInput();
          Validator[] validators = new Validator[]{
        new MaxValueValidator(10_000),
        new CurrencyValidator(),
        new InputStringValidator(),
        new MinValueValidator(1)
};

        Money money = userInput.read(validators);
        Currency currency = Currency.getInstance(money.getCurCode());
        String ending = currency.getEndings(money.getAmount());
        UserOutput userOutput = new ConsoleUserOutput();
        userOutput.print(money.getAmount()+" "+ending);
    }


}