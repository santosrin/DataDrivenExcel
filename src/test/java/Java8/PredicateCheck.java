package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCheck {

    public static void main(String[] args) {
//        Predicate<Integer> func = x -> x > 5;
       List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());
//        System.out.println(colList);

        List<Integer> l1 = list.stream().filter(x -> x >5 && x<9).collect(Collectors.toList());
        System.out.println(l1);

        List<String> s1 = Arrays.asList("Java","Jav","Naveen","Nav");
        Predicate<String> s4 = x -> x.startsWith("Nav");
        List<String> s2 = s1.stream().filter(s4.negate()).collect(Collectors.toList());
        System.out.println(s2);
    }
}
