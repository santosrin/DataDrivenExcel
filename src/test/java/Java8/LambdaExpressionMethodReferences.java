package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionMethodReferences {
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Tom","Peter","Naveen","Simon");
        //1. With Anonymous class :
        namesList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //2. Lambda Exp:
        namesList.forEach(str -> System.out.println(str) );

        //3. Method references:
        namesList.forEach(System.out::println);
    }
}
