package smruti;

import java.util.ArrayList;
import java.util.HashSet;

public class AListtoHSet {
        void hashS(ArrayList<Integer> a) {
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < a.size(); i++) {
                hs.add(a.get(i));
            }
            System.out.println(hs);
        }
        public static void main(String[] args) {
            AListtoHSet f = new AListtoHSet();
            ArrayList<Integer> al = new ArrayList<>();
            al.add(5);
            al.add(6);
            al.add(10);
            al.add(5);
            al.add(null);
            al.add(15);
            f.hashS(al);
        }
}
// create an array list and put them in hashset

