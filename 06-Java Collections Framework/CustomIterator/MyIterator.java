import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T>{

    private T[] elements;
    private int currentIndex;

    public MyIterator(T[] elements){
        this.elements = elements;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.length;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException("No More elements in the collection!");

        T t = elements[currentIndex++];
        return t;
    }
}