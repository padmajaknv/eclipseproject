package Akhil;

public class reverse_palindrome {
    void reverse(String x){
        char [] ch=x.toCharArray();
        String rev="";
        for (int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        System.out.println("Reverse of the given String:"+rev);
    }
    void palindrome(String x) {
        char[] ch = x.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        if (rev.equals(x)) {
            System.out.println("Given string is palindrome:"+rev);
        }
        else{
            System.out.println("Given string is not palindrome:"+rev);
        }
    }
    public static void main(String[] args) {
        reverse_palindrome rp=new reverse_palindrome();
        rp.reverse("corejava");
        rp.palindrome("madam");
    }
}

