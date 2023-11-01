public class Book implements Cloneable{
    private String name;

    public Book(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
