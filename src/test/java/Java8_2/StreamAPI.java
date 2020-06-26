package Java8_2;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        l.forEach(x -> System.out.println(x));
    }

}
