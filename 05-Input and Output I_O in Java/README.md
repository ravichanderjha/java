# Input and Output (I/O) in Java

Input and Output (I/O) operations are essential for interacting with the external world in Java programs. Java provides various classes and methods to perform Input and Output operations, including file handling and standard input/output.

## File Handling (Reading and Writing Files)

Java supports file handling to read data from files (input) and write data to files (output). File I/O is useful for reading configuration files, reading data from databases, and storing data in persistent storage.

### Reading from a File

To read data from a file in Java, you can use classes like `FileInputStream`, `BufferedReader`, and `Scanner`.

Example using `BufferedReader`:

```java
import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
```

### Writing to a File

To write data to a file in Java, you can use classes like `FileOutputStream`, `BufferedWriter`, and `PrintWriter`.

Example using `BufferedWriter`:

```java
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
```

## Standard Input and Output (System.in, System.out)

Java provides the `System` class, which contains standard input (keyboard input) and standard output (console output) streams.

### Reading from Standard Input (Keyboard)

To read data from the standard input (keyboard), you can use the `Scanner` class or `BufferedReader` class with `System.in`.

Example using `Scanner`:

```java
import java.util.Scanner;

public class ReadFromConsoleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
```

### Writing to Standard Output (Console)

To write data to the standard output (console), you can use the `System.out` stream.

Example:

```java
public class WriteToConsoleExample {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        int number = 42;
        System.out.println("The number is: " + number);
    }
}
```

---

Input and Output operations are fundamental for building interactive and data-driven Java applications. Whether you need to read data from files, write data to files, or interact with users through the console, Java's I/O capabilities provide a versatile set of tools to handle various scenarios.