import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String args[]){
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> compareList = Arrays.asList(20, 40, 50);

        System.out.println(intList.containsAll(compareList));
    }
}
