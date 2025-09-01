package Vivek;

public class counytofvowles {

    int vowelcount(String s){
        int count =0;
        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if (x == 'a' ||x ==  'e' ||x ==  'i' ||x ==  'o' ||x ==  'u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        counytofvowles m = new counytofvowles();
        String s="Helloworld";
        int k = m.vowelcount(s);
        System.out.println(k);

    }
}
