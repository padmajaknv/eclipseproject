package padmaja.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

//Create an array list and insert those elements into Tree set and Hash set
public class arrylst {
  void arrylsttree(){
      ArrayList<Integer> al = new ArrayList();
      al.add(45);
      al.add(55);
      al.add(60);
      al.add(60);
      al.add(0);
      al.add(65);
      al.add(70);
      al.add(75);
      al.add(80);
      al.add(85);
      System.out.println("ArrayList="+al);
      HashSet<Integer> hs=new HashSet<>(al);
      TreeSet<Integer> ts=new TreeSet<>(al);
      System.out.println("HashSet="+hs);
      System.out.println("TreeSet="+ts);
  }
  public static void main(String[] args) {
      arrylst lst=new arrylst();
      lst.arrylsttree();
    }
}
