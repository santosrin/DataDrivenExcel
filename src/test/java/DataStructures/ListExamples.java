package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List mylist = new ArrayList<>();
        mylist.add("Object 1");
        mylist.add("Object 2");
        mylist.add("Object 3");

        mylist.remove(0);
        String o = (String) mylist.get(0);
        int size = mylist.size();

        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        mylist.clear();
        for(Object next: mylist) {
            System.out.println(next);
        }



    }
}
