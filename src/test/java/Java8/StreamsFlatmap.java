package Java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsFlatmap {
    public static void main(String[] args) {

        String data[][] = new String[][] {
         {"a","b"},
         {"c","d"},
         {"e","f"}
        };

//       Stream<String[]> dataStream =  Arrays.stream(data);
//       //Apply flatmap on dataStream:
//        Stream<String> dsf = dataStream.flatMap(x -> Arrays.stream(x));
//       Stream<String> ds1 = dsf.filter(x -> "a".equals(x.toString()));
//       ds1.forEach(System.out::println);

       Stream<String> fins = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "a".equals(x.toString()));
       fins.forEach(System.out::println);
    }
}
