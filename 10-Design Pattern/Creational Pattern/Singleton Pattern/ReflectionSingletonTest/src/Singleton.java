public class Singleton {
    public static Singleton instance;

    private Singleton(){
        System.out.println("Singleton Instance Created!");
    }

    public static Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
