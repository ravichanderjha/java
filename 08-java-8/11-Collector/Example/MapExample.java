import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String args[]){
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> priceList = productsList.stream().map(product -> product.price).collect(Collectors.toList());
        System.out.println(priceList.toString());

        Set<Float> priceSet = productsList.stream().map(product -> product.price).collect(Collectors.toSet());
        System.out.println(priceSet.toString());

    }
}
