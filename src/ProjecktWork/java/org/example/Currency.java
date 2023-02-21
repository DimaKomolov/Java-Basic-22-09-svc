package org.example;

import java.util.Objects;

public enum Currency  {
    RUB("рубль","рубля","рублей"),
    USD("доллар","доллара","долларов");
    public static Currency getInstance(String cur) throws InvalidCurrencyException {
        if(Objects.equals(cur, String.valueOf(RUB))){
            return RUB;
        }else if(Objects.equals(cur, String.valueOf(USD))){
            return USD;
        }else {
            throw new InvalidCurrencyException();
        }
    }
    private final String[] endings;

   Currency(String... endings) {

       this.endings = endings;
    }
    public  String  getEndings(int amount) {
       if ((amount % 100 >=11)&&(amount % 100 <=14)||(amount % 10 >=5)||(amount % 10 == 0)) {
           return endings[2];
       } else if (amount % 10 == 1) {
            return endings[0];
        } else if ((amount % 10 >= 2) && (amount % 10 <= 4)) {
            return endings[1];
        }
        return null;
    }

}
