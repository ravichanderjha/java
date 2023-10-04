import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationExample {
    public static void main(String args[]){
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        double sum = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
        System.out.println("SUM: " + sum);
        double average = productsList.stream().collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("average: " + average);
        double count = productsList.stream().collect(Collectors.counting());
        System.out.println("count: " + count);
    }
}

