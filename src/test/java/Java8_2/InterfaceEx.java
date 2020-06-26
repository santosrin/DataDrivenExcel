package Java8_2;

public interface InterfaceEx {

    void test();
    default void show() {
        System.out.println("default check");
    }

    static void display() {
        System.out.println("static check");
    }
}
