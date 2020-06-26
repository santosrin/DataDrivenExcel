package Java8;

public class GenericsDemo<T> {

    T ob;

    GenericsDemo(T ob) {
        this.ob = ob;
    }

    public void show() {
        System.out.println(ob.getClass().getName());
    }
}
