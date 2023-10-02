import java.util.Arrays;
import java.util.Iterator;

public class MyCollection<T> implements Iterable<T>{

        private Object[] elements;

        private int size;
        private static final int DEFAULT_CAPACITY = 10;


    public MyCollection() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add (T element){
        ensureCapacity();
        elements[size++] = element;
    }

    private void ensureCapacity() {
        if(size != elements.length)
            return;
        int newCapacity = size * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(elements);
    }
}