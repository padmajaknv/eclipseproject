package JavaConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('A');
        hs.add('b');
        hs.add('X');
        hs.add('a');
        hs.add('1');
        hs.add('A');
        System.out.println(hs);
        for(Character ch:hs){
            System.out.println(ch);
        }
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains('c'));
        hs.remove('A');
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);
        Iterator<Character> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
