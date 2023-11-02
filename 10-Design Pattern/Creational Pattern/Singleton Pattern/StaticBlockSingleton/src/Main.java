public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("StaticBlockSingleton");
        System.out.println("Hello world!");
    }
}