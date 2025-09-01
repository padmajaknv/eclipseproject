package Bhanukrishna07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class ArraylisttohashSetAndTreeSet{

public static ArrayList<String> insertElements(String... elements) {
    ArrayList<String> list = new ArrayList<>();
    for (String element : elements) {
        list.add(element);
    }
    HashSet<String> hs=new HashSet<>(list);
    System.out.println("ArrayList->HashSet:"+hs+" ");
    TreeSet<String> ts=new TreeSet<>(list);
    System.out.println("ArrayList->TreeSet:"+ts+" ");
    return list;
}
    public static void main(String[] args)throws Exception {
    ArrayList<String> list=ArraylisttohashSetAndTreeSet.insertElements("ABC","XYZ","PQR","ABC","IJK","PQR");
        System.out.println("Arraylist->"+list);
}
}