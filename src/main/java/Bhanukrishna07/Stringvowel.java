package Bhanukrishna07;

public class Stringvowel {

    int a(String x) {
        String s = x.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Stringvowel sa=new Stringvowel();
       int y= sa.a("JAVAwithSelenium");
        System.out.println("Number of vowels in a String:"+y);
    }

}
