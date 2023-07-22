// Interface
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing a document.");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing an image.");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        // Creating objects and calling the print() method
        Printable document = new Document();
        Printable image = new Image();

        document.print(); // Output: Printing a document.
        image.print();    // Output: Printing an image.
    }
}
