package DataStructures;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);

        System.out.println(ar.size());

        ar.add(40);
        ar.add(50);
        ar.add(50);

        System.out.println(ar.size());
        System.out.println(ar.get(4));

        for(Integer value:ar) {
            System.out.println(value);
        }

      Iterator it =  ar.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
