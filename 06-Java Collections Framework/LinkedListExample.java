import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Lion"); // Duplicates are allowed

        System.out.println("LinkedList: " + animals);
    }
}