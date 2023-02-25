package org.example;

public class MinValueValidator implements Validator{
    private final int minValue;

    public MinValueValidator(int minValue) {

        this.minValue = minValue;
    }
    @Override
    public boolean validate(int value) {
        return (value >= minValue);
    }
    @Override
    public boolean validate(String value0) {

        return true;
    }

    @Override
    public String messing() {
        return ("Введено отрицательное число");
    }

}
