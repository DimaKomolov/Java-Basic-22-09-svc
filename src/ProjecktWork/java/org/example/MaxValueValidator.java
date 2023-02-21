package org.example;

public class MaxValueValidator implements Validator {

    private final int maxValue;

    public MaxValueValidator(int maxValue) {

        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(int value) {

        return (value <= maxValue);
    }

    @Override
    public boolean validate(String value0) {
        return true;
    }

    @Override
    public String messing() {
        return ("Введено слишком большое число");
    }

}