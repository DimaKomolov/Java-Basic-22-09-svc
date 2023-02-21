package org.example;

public class CurrencyValidator implements Validator {

    @Override
    public boolean validate(String value0) {
        Currency[] values = Currency.values();
        for (Currency value:values) {
            if(value.name().equals(value0)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String messing() {
        return null;
    }
}