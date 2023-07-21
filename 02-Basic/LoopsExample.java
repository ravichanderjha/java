public class LoopsExample {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        int num = 1;
        do {
            System.out.println("Value: " + num);
            num++;
        } while (num <= 5);
    }
}
