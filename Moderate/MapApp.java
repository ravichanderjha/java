package Moderate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapApp {
    public static void main(String args[]){
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("apple", 0.99);
        fruitPrices.put("banana", 0.25);
        fruitPrices.put("orange", 1.50);

        //Key Set View
        Set<String> keys = fruitPrices.keySet();
        for (String key : keys) {
            System.out.println(key + " costs " + fruitPrices.get(key));
        }

        //Values View
        Collection<Double> values = fruitPrices.values();
        for (Double value : values) {
            System.out.println("A fruit costs " + value);
        }

        //Entry Set View
        Set<Map.Entry<String, Double>> entries = fruitPrices.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());
        }



    }
}
