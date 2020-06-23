package DataStructures;

import com.google.gson.internal.LinkedHashTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashTreeMap<>();
        map.put("Name","xyz");
        map.put("Desig","ceo");

          //Keyset
           Set<String> key = map.keySet();
           for(String k : key) {
               System.out.println(k + " : " + map.get(k));
           }

           //Entry set
           for(Map.Entry m : map.entrySet()) {
               System.out.println(m.getKey() + " : "+ m.getValue());
           }
    }
}
