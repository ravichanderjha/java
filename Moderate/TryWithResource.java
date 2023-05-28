package Moderate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String args[]){
        /*
        In Java, any object that implements the AutoCloseable or Closeable interface can be used as a resource in a try-with-resources block.

        The AutoCloseable interface was introduced in Java 7, and it has a single method close(). The Closeable interface extends the AutoCloseable interface and has an additional method close(), which throws an IOException.

        Some common examples of resources that can be used in a try-with-resources block include:

        FileInputStream, FileOutputStream, FileReader, and FileWriter for reading and writing files.
        Socket and ServerSocket for network connections.
        Connection, Statement, and ResultSet for working with databases using JDBC.
        Scanner and PrintWriter for reading and writing from/to the console.
        ZipFile and ZipOutputStream for reading and writing ZIP files.
        By using try-with-resources block, you can avoid manually closing the resources in your code. The resources will be automatically closed by the Java runtime at the end of the block, whether an exception is thrown or not.
         */
        try (FileInputStream fileInputStream = new FileInputStream("file.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
