public class Main {
    public static void main(String[] args) {
        BillPughSingleton s1 = BillPughSingleton.getInstance();
        BillPughSingleton s2 = BillPughSingleton.getInstance();
        System.out.println("Equal S1 == S2 : " + s1.equals(s2));
    }
}