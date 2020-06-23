package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"San");
        hm.put(2,"Vish");
        hm.put(3,"Chet");
        hm.put(4,"Rahul");
        hm.put(null,"Rahul1");
        hm.put(5,null);
        hm.put(6,null);

       for(Map.Entry e : hm.entrySet()) {
           System.out.println(e.getKey() + " : "+ e.getValue());
       }

       //Emp Class
       EmpClass e1 = new EmpClass(1,"A",10);
       EmpClass e2 = new EmpClass(2,"B",20);

       Map<Integer,EmpClass> e = new HashMap<>();
       e.put(1,e1);
       e.put(2,e2);

       for(Map.Entry<Integer,EmpClass> en : e.entrySet()) {
            int key = en.getKey();
            EmpClass emp = en.getValue();
           System.out.println(emp.empid + " " + emp.empname + " " + emp.empsal);
       }

    }
}
