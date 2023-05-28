package Moderate.ComparableComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorApp {
    public static void main(String args[]){

        //Comparator
        TreeSet<Person> persons = new TreeSet<>(Comparator.comparing(Person::getName));
        persons.add(new Person("John", 30));
        persons.add(new Person("Jane", 25));
        persons.add(new Person("Bob", 35));

        for (Person person : persons) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
        }
    }
}
