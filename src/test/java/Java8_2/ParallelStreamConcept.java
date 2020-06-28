package Java8_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {
    public static void main(String[] args) {
        ForkJoinPool corePools = ForkJoinPool.commonPool();
        System.out.println(corePools.getParallelism());

        // 1. parallel() method on stream:
        Stream stream = Stream.of("san","man","wan","can");
       // BaseStream parallelStream = stream.parallel();
        Stream.of("san","man","wan","can").parallel().forEach(System.out::println);

        //2. use parallelStream() method on a collection stream
        Arrays.asList("san","man","wan","can").parallelStream().forEach(System.out::println);

        //1 to 10
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,10).parallel().forEach(System.out::println);

        //to print from alphabetical order
        System.out.println(getAlphaList());
        getAlphaList().stream().forEach(System.out::println);
        getAlphaList().parallelStream().forEach(System.out::println);

        //check stream is running in parallel mode : isParallel() method
        IntStream range = IntStream.rangeClosed(1,10);
        System.out.println(range.isParallel());

        IntStream range1 = IntStream.rangeClosed(1,10);
        range1.parallel();
        System.out.println(range1.isParallel());


    }

    public static List<String> getAlphaList() {
        List<String> alpha = new ArrayList<String>();
        int n = 97;
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }
        return alpha;
    }

}
