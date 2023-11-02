public class BillPughSingleton {
    private BillPughSingleton(){
        System.out.println("BillPughSingleton instance created");
    }
    private static class BillPughSingletonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.instance;
    }
}
