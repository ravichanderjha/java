import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> grades = new TreeMap<>();
        grades.put(80, "A");
        grades.put(70, "B");
        grades.put(90, "A");
        grades.put(60, "C");

        System.out.println("TreeMap: " + grades);
    }
}