package JavaConcepts;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        int[] a = new int[6];
        ArrayList<Integer> al = new ArrayList();

        char[] h = {'a','b','c','d'};
        System.out.println(h.length);
        a[0] = 5;
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        System.out.println(al);
        al.add(9);
        System.out.println(al.indexOf(9));
        System.out.println(al.lastIndexOf(9));
        System.out.println(al.size());
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains(2));
        System.out.println(al.get(4));
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("===============");
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
        System.out.println("===============");
        for(Integer aa: al){
            System.out.println(aa);
        }
    }
}
