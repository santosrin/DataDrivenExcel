package Java8;

import java.util.function.Function;

public class FunctionInterfaceConcept {
    public static void main(String[] args) {

        Function<String,Integer> func = x ->x.length();
        int len = func.apply("This is Java 8");
        System.out.println(len);

        //chanining function:
        Function<Integer , Integer> func2 = x -> x*2;
        int result = func.andThen(func2).apply("This is Naveen here");
        System.out.println(result);
    }
}
