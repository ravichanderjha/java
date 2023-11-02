public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){
        System.out.println("ThreadSafeSingleton instance created!");
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }
    public static ThreadSafeSingleton getInstanceUsingDoubleLock(){
        if(instance == null)
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null)
                    instance = new ThreadSafeSingleton();
            }
        return instance;
    }
}
