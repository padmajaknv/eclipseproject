package padmaja.java;

import java.util.TreeSet;

//Insert elements from array to Tree set
public class arrtotree {
    void tree() {
        int[] arr = {10, 20, 20, 10, 30, 40, 50};
        String[] ss = {"Aaa","bbbb","vvvv","cccc","bbbb"};
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<String> str = new TreeSet<>();
        for (int num : arr) {
            ts.add(num);
        }
        System.out.println(ts);
        for (String num1:ss){
            str.add(num1);
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        arrtotree tss=new arrtotree();
        tss.tree();
    }
}
