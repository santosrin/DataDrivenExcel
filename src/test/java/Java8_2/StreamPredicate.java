package Java8_2;

import java.util.Arrays;
import java.util.List;

public class StreamPredicate {
    public static void main(String[] args) {
       List<Integer> ls = Arrays.asList(12,20,35,46,55,68,75);
        //List<Integer> ls = Arrays.asList(6,9);
        int result = 0;
        for(int i : ls) {
            if(i%5 == 0) {
                result +=i;
            }
        }
        System.out.println(result);
//        System.out.println(ls.stream().
//                               filter(i -> i%5==0).
//                               map(i -> i*2).
//                               reduce(0,(c,e) -> c+e));

        System.out.println(ls.stream().
                filter(i -> i%5==0).
                map(i -> i*2).
                findFirst().
                orElse(0));
    }
}
