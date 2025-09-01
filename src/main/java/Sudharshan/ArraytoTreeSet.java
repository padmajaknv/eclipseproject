package Sudharshan;

import java.util.Arrays;
import java.util.TreeSet;

public class ArraytoTreeSet{
    char[] treeset(char[] x){
        TreeSet<Character> ch=new TreeSet<>();
        for(int i=0;i<x.length;i++){
            ch.add(x[i]);
        }
        System.out.println("Array to TreeSet:"+ch);
        return x;
    }
    public static void main(String[] args) {
        ArraytoTreeSet at=new ArraytoTreeSet();
        char[] ch = {'a', 'g', 'f', 'j', 'a', 'g','j','c'};
        at.treeset(ch);
    }
}