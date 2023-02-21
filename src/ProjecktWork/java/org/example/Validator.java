package org.example;

public interface Validator {
    default boolean validate(int value){
        return true;
    }
    default boolean validate(String value0){
        return true;
    }
    default boolean validate(String[] value){
        return true;
    }
          String messing();
}
