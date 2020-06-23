package DataStructures;

import java.util.LinkedList;

public class LinkedListCheck {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        System.out.println(ll);

        ll.addFirst(5);
        ll.addLast(25);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.set(1,22);

        for(int l1:ll) {
            System.out.println(l1);
        }
    }
}
