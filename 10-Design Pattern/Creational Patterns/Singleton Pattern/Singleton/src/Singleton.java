public class Singleton {
    public static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
