package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {
    public static void main(String[] args) {

        //list of customers objects:
        List<Customer> customersList = Arrays.asList(
                new Customer("Tom",30),
                new Customer("Vij",31),
                new Customer("Suj",31),
                new Customer("Ruj",31)
        );
       Customer customer =  customersList.stream().filter(x -> "Tom".equals(x.getName())).findAny().orElse(null);
        System.out.println(customer.getName() + " " + customer.getAge());

        Customer customer1 =customersList.stream().filter((x) -> "Suj".equals(x.getName()) && 31 == x.getAge()).findAny().orElse(null);
        System.out.println(customer1.getName());

    }
}
