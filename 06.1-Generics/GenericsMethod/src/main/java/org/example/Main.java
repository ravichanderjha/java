package org.example;

public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        System.out.println("Compare Integer: " +  b.compareTo(a));

        //Using Generics

        System.out.println("Maximum Integer: " +  finxMax(a, b));
        System.out.println("Maximum Integer: " +  finxMax(1.0, 2.0));
        System.out.println("Maximum Integer: " +  finxMax("Hello", "Ravi"));

    }
    public static <T extends Comparable<T>> T finxMax(T a , T b){
        return a.compareTo(b) > 0 ? a : b;
    }
}