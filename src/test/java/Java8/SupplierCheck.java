package Java8;

import java.util.function.Supplier;

public class SupplierCheck {

    public static void main(String[] args) {

        //takes no argument and return a result.
        getText(()->"Java");
        getText1("Java");

    }

    public static void getText(Supplier<String> text) {
        System.out.println(text.get());
    }

    public static void getText1(String text) {
        System.out.println(text);
    }
}
