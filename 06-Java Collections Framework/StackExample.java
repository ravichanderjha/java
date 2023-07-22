import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        String topElement = stack.pop();
        System.out.println("Popped: " + topElement);
        System.out.println("Updated Stack: " + stack);
    }
}