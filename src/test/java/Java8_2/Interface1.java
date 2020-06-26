package Java8_2;

public interface Interface1 {

    void test1();

    default void show() {
        System.out.println("interface1");
    }
}
