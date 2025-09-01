package haraprasad;

import java.util.HashSet;

public class uniqueCity {
    void city(String s){
        String[] a=s.split(",");
        HashSet<String> set=new HashSet<>();
        for(String i:a){
            set.add(i.toLowerCase());
        }
        for(String j:set){
            System.out.println(j);
        }
        System.out.println("No of Different City: "+set.size());

    }
    public static void main(String[] args) {
        uniqueCity d=new uniqueCity();
        d.city("Pune,Hyderabad,puNE,Chennai,hyDERabad,mumBAI,cheNNAI");
    }

}
