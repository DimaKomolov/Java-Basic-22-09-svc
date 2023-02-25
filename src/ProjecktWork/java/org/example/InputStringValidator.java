package org.example;

public class InputStringValidator implements Validator {

    @Override
    public boolean validate(String[] value) {

        return value.length == 2;
    }

    @Override
    public String messing() {

        return "Вы ввели не корректную строчку";
    }
}