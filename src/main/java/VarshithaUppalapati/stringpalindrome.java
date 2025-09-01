package VarshithaUppalapati;

public class stringpalindrome {
    void a(String s) {
        char[] b = s.toCharArray();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + b[i];
        }
        System.out.println(reverse);
            if(s.equals(reverse)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        stringpalindrome s=new stringpalindrome();
        s.a("mom");
    }
}
