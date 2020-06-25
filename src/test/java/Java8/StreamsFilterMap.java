package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

    public static void main(String[] args) {
        List<Customer> cs = Arrays.asList(
           new Customer("A",20),
           new Customer("B",21),
           new Customer("C",22)
        );

        String name = cs.stream().filter(x -> "A".equals(x.getName())).map(Customer::getName).findAny().orElse(null);
        System.out.println(name);

        List<String> csl = cs.stream().map(Customer::getName).collect(Collectors.toList());
        csl.forEach(System.out::println);
    }
}
