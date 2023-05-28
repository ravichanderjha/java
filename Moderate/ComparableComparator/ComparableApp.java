package Moderate.ComparableComparator;

import java.util.TreeSet;

public class ComparableApp {
    public static void main(String args[]){
        //Comparable
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Jane", 25));
        persons.add(new Person("Bob", 35));

        for (Person person : persons) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
        }

    }
}
