package org.example;

public class LowerBoundedGeneric<T extends Number> {
    private T t;
    public LowerBoundedGeneric(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
    public T set(T t){
        return this.t = t;
    }

    public void addIntegers(LowerBoundedGeneric<? super Integer> lowerBoundedGeneric) {

        this.set((T) lowerBoundedGeneric.get());=====--
    }
}
