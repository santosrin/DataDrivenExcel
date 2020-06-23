package DataStructures;

import com.gargoylesoftware.htmlunit.svg.SvgAltGlyph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(123);
        ls.add(232);
        ls.add(564);
        ls.add(431);

//        Collections.sort(ls);
//        System.out.println(ls);

//        Comparator<Integer> com = new CompImpl();
//        Collections.sort(ls,com);
        Collections.sort(ls,(o1,o2) -> {
            return o1%10>o2%10?1:-1;
        });
        for(int i: ls) {
            System.out.println(i);
        }
    }
}
