package haraprasad;

import java.util.TreeSet;

public class arrayToTreeSet {
    void TreeSet(char[] a){
        TreeSet<Character> t=new TreeSet<>();
        for(char i:a){
            t.add(i);
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        arrayToTreeSet ts=new arrayToTreeSet();
        char[] a={'a','b','c','a','g'};
        ts.TreeSet(a);
    }
}
