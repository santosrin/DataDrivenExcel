package DataStructures;


import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> h = new Hashtable();
        h.put("A","Test");
        h.put("B","Test1");
        h.put("C","Test2");
        h.put("D","Test3");
        System.out.println(h.size());
        System.out.println(h.get("A"));
        h.remove("D");
        System.out.println(h.size());

        for(String str : h.keySet()) {
            System.out.println(str + ":" +h.get(str));
        }

    }
}
