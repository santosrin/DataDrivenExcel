package Java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

    public static void main(String[] args) {
        BinaryOperator<Integer> func = (x1,x2) -> x1+x2;
        int t = func.apply(10,20);
        System.out.println(t);

        //BiFunction interface:
        BiFunction<Integer,Integer,Integer> func1 = (x1, x2) -> x1+x2;
        int t1 = func1.apply(30,40);
        System.out.println(t1);
    }
}
