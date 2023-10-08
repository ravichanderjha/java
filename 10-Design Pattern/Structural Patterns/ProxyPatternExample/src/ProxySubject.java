public class ProxySubject implements Subject{
    ClassSubject classSubject;

    @Override
    public void request() {
        System.out.println("Proxy is triggered!");
        if(null == classSubject)
            classSubject = new ClassSubject();
        classSubject.request();
    }
}
