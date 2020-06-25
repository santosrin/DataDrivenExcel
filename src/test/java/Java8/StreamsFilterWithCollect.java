package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterWithCollect {
    public static void main(String[] args) {
        List<String> productList = Arrays.asList("MacBook","iPhone","Shoes","Battery Charger","Bat");
//        System.out.println(productList);
//        productList.forEach(System.out::println);
        List<String> ls = productList.stream().filter(ele -> !ele.equals("iPhone")).collect(Collectors.toList());
        //System.out.println(ls);
        ls.forEach(System.out::println);

    }
}
