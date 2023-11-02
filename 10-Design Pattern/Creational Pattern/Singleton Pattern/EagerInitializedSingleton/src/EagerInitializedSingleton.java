public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){
        System.out.println("EagerInitializedSingleton Instance Created!");
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public void test(){
        System.out.println("Test EagerInitializedSingleton!");
    }
}
