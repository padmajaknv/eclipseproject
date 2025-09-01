package Akhil;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArraylist {
    static int[] al(int[] x){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<x.length;i++){
            al.add(x[i]);
        }
        System.out.println("array to arraylist:"+al);
        return x;
    }
    public static void main(String[] args) {
        int[] array={1,3,4,5,9,8,10,18};
        ArraytoArraylist.al(array);
    }
}