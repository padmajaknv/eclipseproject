package padmaja.java;

import java.util.ArrayList;

//Insert values from array to array list
public class arrtoarrlst {
    void arrlst(){
        int[] arr={10,20,30,40,50,60,40};
        ArrayList<Integer> al=new ArrayList();
        for(Integer num:arr){
            al.add(num);
        }
        System.out.println("Array List:"+al);
    }
    public static void main(String[] args) {
        arrtoarrlst als=new arrtoarrlst();
        als.arrlst();
    }
}
