package DataStructures;

import com.gargoylesoftware.htmlunit.svg.SvgAltGlyph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBrace {

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>()
        {{
            add(56);
            add(67);
            add(90);
        }};
//        ls.add(56);
//        ls.add(67);
//        ls.add(90);

        //List<Integer> ls = Arrays.asList(56,67,90);

        for(int i : ls) {
            System.out.println(i);
        }
    }
}
