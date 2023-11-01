package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add("2");
//
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            Integer i = (Integer) iterator.next();
//            System.out.println(i);
//        }

        String[] stringArray = {"Hello", "world"};
        System.out.println(toList(stringArray));
    }

    public static <A> List<A> toList(A[] a){
        return Arrays.asList(a);
    }
}