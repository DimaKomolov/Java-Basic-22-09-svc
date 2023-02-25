package org.example;

public class ConsoleUserOutput implements UserOutput {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
