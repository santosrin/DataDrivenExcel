package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceImpl {

    public static void main(String[] args) {

        Consumer<String> func = x -> System.out.println(x);
        func.accept("This is Naveen here!!!");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //list.forEach( x -> System.out.println(x));
        list.forEach(System.out::println);

    }
}
