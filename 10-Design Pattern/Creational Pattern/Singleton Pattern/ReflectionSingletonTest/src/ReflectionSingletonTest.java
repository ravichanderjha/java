import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
    public static <T> void breakSingleton(T t1, T t2) throws Exception {
        Constructor[] constructors = t1.getClass().getDeclaredConstructors();

        for(Constructor constructor:constructors){
            constructor.setAccessible(true);
            t2 = (T) constructor.newInstance();
            break;
        }
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }
}
