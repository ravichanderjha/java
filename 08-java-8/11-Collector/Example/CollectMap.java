import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMap {

    public static void main(String args[]){
        List<String> stringList = Arrays.asList("Java", "Java", "Python", "C++", "JavaScript");

//        Map<String, Integer> stringLength = stringList.stream().collect(Collectors.toMap(s->s, String::length));
//
//        System.out.println(stringLength.toString());
        //Group
        Map<String, Long> stringCount = stringList.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));

        stringCount.forEach((string, count) ->
                System.out.println(string + "': " + count));

        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 800.0f),
                new Product(2, "Mouse", 20.0f),
                new Product(3, "Keyboard", 50.0f),
                new Product(4, "Laptop", 1000.0f),
                new Product(5, "Mouse", 25.0f)
        );

        Map<String, Double> productsByName = products.stream().collect(Collectors.groupingBy(Product::getName, Collectors.averagingDouble(p-> p.price)));
        productsByName.forEach((name, priceAvg) ->
                System.out.println("Products with name '" + name + "': " + priceAvg));


        //Count each Character in String
        String myString = "Hello, World!";
        Map<Character, Long> charCount = myString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCount);
    }
}
