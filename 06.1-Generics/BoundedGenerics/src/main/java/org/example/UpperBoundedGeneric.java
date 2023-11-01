package org.example;

public class UpperBoundedGeneric<T extends Number> {
    private T t;
    public UpperBoundedGeneric(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
}
