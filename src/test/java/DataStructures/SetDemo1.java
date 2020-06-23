package DataStructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(30);

        for(int i : s) {
            System.out.println(i);
        }

        String arr[] = {"Java","JS","C","Java","Python"};

        Set<String> s1 = new HashSet<>();
        for(int i =0;i<arr.length;i++) {
            if(s1.add(arr[i]) == false) {
                System.out.println("Duplicate element: "+  arr[i]);
            } else  {
                System.out.println("Unique element: " + arr[i]);
            }
        }


    }
}
