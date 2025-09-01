package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"AA");
        m.put(3,"CC");
        m.put(2,"BB");
        m.put(4,"DD");
        m.put(5,"EE");
        m.put(5,"FF");
        m.put(6,"AA");
        m.put(null,"XX");
        m.put(null,"YY");
        m.put(7,null);
        m.put(8,null);
        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println(m.containsKey(9));
        System.out.println(m.containsValue("XX"));
        System.out.println(m.get(5));
        System.out.println(m.get(null));
        for(Map.Entry<Integer,String> mm: m.entrySet()){
            System.out.println(mm.getKey() +"->"+mm.getValue());
        }
    }
}
