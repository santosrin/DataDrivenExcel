package Java8;

//import java.util.ArrayList;
//import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorCheck {

    public static void main(String[] args) {

        UnaryOperator<Integer> func = x-> x*7;
        int n1 = func.apply(10);
        System.out.println(n1);

        Function<Integer,Integer> func1 = x -> x*10;
        System.out.println(func1.apply(40));

//        List<String> langList = new ArrayList<String>();
//        langList.add("Java");
//        langList.add("Ruby");
//        langList.add("Python");
//
//        System.out.println(langList);
//
//        langList.replaceAll(ele -> ele + " Naveen");
//        System.out.println(langList);

    }
}
