public class Main {
    public static void main(String[] args) throws Exception {
        ReflectionSingletonTest.breakSingleton(EagerInitializedSingleton.getInstance(), null);
        ReflectionSingletonTest.breakSingleton(BillPughSingleton.getInstance(), null);
        ReflectionSingletonTest.breakSingleton(Singleton.getInstance(), null);
        ReflectionSingletonTest.breakSingleton(StaticBlockSingleton.getInstance(), null);
        ReflectionSingletonTest.breakSingleton(ThreadSafeSingleton.getInstance(), null);
    }
}