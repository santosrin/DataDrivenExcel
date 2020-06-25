package Java8;

@FunctionalInterface
public interface WebPage {
    void header(String value,int age); // only one abstract method
    public static void test() {

    }
    default void display() {

    }

}
