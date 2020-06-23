package DataStructures;

import com.google.common.collect.Iterables;
import org.apache.logging.log4j.core.util.Integers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(41);
        s.add(5);
        System.out.println(s);
        s.remove(2);
        System.out.println(s);

         Iterator<Integer> it = s.iterator();
         while (it.hasNext()) {
             System.out.print(it.next() + " ");
         }
    }
}
