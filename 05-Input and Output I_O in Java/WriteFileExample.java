import java.io.*;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello, Java!");
            writer.newLine();
            writer.write("This is a sample text.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}