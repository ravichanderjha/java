import java.util.Iterator;

public class MyIteratorApp {
    public static void main(String[] args) {
        MyCollection<Integer> myCollection = new MyCollection();
        myCollection.add(10);
        myCollection.add(20);
        myCollection.add(30);
        myCollection.add(40);
        myCollection.add(50);

        for(Integer element: myCollection){
            System.out.println(element);
        }

        Iterator iterator = myCollection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}