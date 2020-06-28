package Java8_2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {
        //infinite streams used to generate infinite stream of data

        //1. iterate()
        //static (T seed , UnaryOperator<T> f)
        // return a stream --> Stream<T>

        List<Integer> ls = IntStream.iterate(0, n -> n+2).
                mapToObj(Integer::valueOf).
                limit(10).
                collect(Collectors.toList());
        System.out.println(ls);

        //2. generate
        //static generate(Supplier<T> s)
        List<Integer> ls1 = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
        System.out.println(ls1);
    }
}
