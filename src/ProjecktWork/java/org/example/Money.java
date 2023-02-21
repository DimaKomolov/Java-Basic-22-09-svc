package org.example;

public class Money {
    private final int amount;
    private final String curCode;

    public Money(int amount, String curCode) {
        this.amount = amount;
        this.curCode = curCode;
    }
    public int getAmount() {
        return amount;
    }
    public String getCurCode() {
        return curCode;
    }
}
