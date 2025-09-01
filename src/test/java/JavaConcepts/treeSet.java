package JavaConcepts;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("ABC");
        ts.add("ab");
        ts.add("123");
        ts.add("DEF");
        ts.add("123");
//        ts.add(null);
        ts.add("cd");
        System.out.println(ts);
        for(String s:ts){
            System.out.println(s);
        }
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains("123"));
        ts.remove("ab");
        System.out.println(ts);
    }
}
