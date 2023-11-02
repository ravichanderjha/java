public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){
        System.out.println("StaticBlockSingleton instance Created!");
    }
    static{
        instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
