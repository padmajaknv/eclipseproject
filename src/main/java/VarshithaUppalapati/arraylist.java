package VarshithaUppalapati;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Testing");
        names.add("Java");
        names.add(".Net");
        names.add("Python");
        names.add("Cyber security");
        names.add("Azure");

        System.out.println("courses list : " + names);

        HashSet<String> hashset = new HashSet<>();
        for (String s : names) {
            hashset.add(s);
        }
        System.out.println("hashset" + hashset);
        System.out.println();

        TreeSet<String> treeset = new TreeSet<>();
        for (String v : names) {
            treeset.add(v);
        }
        System.out.println("treeset" + treeset);
        System.out.println();
    }
}

