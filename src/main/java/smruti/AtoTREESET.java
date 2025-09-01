package smruti;

import java.util.TreeSet;

public class AtoTREESET {
    void treeS(int[] x){
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i=0;i<x.length; i++){
            ts.add(x[i]);
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        AtoTREESET m = new AtoTREESET();
        int[] x ={6,2,7,4,1,6};
        m.treeS(x);
    }
}

// insert elements from array to treeset
