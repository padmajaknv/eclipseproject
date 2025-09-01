package haraprasad;

import java.util.ArrayList;
import java.util.HashSet;

public class arrayListToSet {
    void set(ArrayList<Integer> a){
        HashSet<Integer> s=new HashSet<>();
        for(int i:a){
            s.add(i);
        }
        System.out.println("ArrayList To Hashset: "+s);
    }
    public static void main(String[] args){
        arrayListToSet set=new arrayListToSet();
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(2);
        set.set(array);
    }
}
