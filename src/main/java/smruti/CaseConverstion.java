package smruti;

public class CaseConverstion {
    public static void main(String[] args) {
        char x ='H';
        if (x>='a' && x<='z'){
            int result = x-32;
            char u = (char)result;
            System.out.println(u);
        }
        else if (x>='A' && x<='Z'){
            int value = x+32;
            char l = (char)value;
            System.out.println(l);
        }
        else {
            System.out.println("give  the right alphabet");
        }
    }
}
