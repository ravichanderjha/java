package org.example;

public class GenericClass<T> {
    private T t;
    public GenericClass(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }

}
