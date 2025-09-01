package haraprasad;

import java.util.ArrayList;

public class arrayToArrayList {
    void arrayList(String[] a){
        ArrayList<String> al=new ArrayList<>();
        for(String i:a){
            al.add(i);
        }
        System.out.println(al);
    }

    public static void main(String[] args) {
        arrayToArrayList al=new arrayToArrayList();
        String[] arr={"hi","hello","hi","world"};
        al.arrayList(arr);
    }
}
