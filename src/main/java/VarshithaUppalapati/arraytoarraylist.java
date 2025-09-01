package VarshithaUppalapati;

import java.util.ArrayList;

public class arraytoarraylist {
    void a(String[] s) {
        ArrayList<String> list = new ArrayList();
        for (String i : s) {
            list.add(i);
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        arraytoarraylist ar = new arraytoarraylist();
        String[] s = {"moon","sun","earth"};
        ar.a(s);
    }
}

