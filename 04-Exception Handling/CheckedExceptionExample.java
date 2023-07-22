import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            throw new IOException("This is a checked exception.");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}