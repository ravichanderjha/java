import java.util.ArrayList;
import java.util.LinkedList;

public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data){
        Node<T> node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        ArrayList
        LinkedList<Integer> = new
    }

    print
}
