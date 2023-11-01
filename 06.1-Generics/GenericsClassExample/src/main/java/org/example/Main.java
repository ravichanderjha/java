package org.example;

public class Main {
    public static void main(String[] args) {
        GenericClass integerGenericClass = new GenericClass(10);
        System.out.println(integerGenericClass.get());

        GenericClass stringGenericClass = new GenericClass("10");
        System.out.println(stringGenericClass.get());

        GenericClass doubleGenericClass = new GenericClass(10.0);
        System.out.println(doubleGenericClass.get());

    }
}