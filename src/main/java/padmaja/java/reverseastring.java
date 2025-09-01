package padmaja.java;

//Reverse a string without built in methods
public class reverseastring{
        void revstr(String s) {
            String strrev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                strrev = strrev + s.charAt(i);
            }
            System.out.println(strrev);
            if(strrev.equals(s)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }

    public static void main(String[] args) {
        reverseastring ss=new reverseastring();
        ss.revstr("soap");
    }
}

