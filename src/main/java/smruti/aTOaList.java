package smruti;

import java.util.ArrayList;

public class aTOaList {
    void alist (int[] x){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i =0 ; i<x.length ;i++){
            al.add(x[i]);
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        int[] z = {1,2,3,4,5,6,7};
        aTOaList f = new aTOaList();
        f.alist(z);
    }
}
//  insert values from array to arraylist
