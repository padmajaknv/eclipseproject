package Bhanukrishna07;

public class ReverseAndPalindrome {
    void reverse(String x){
        char [] ch=x.toCharArray();
        String rev="";
        for (int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        System.out.println("Reverse of the given String:"+rev);
    }
    void palindreome(String x) {
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
        ReverseAndPalindrome rp=new ReverseAndPalindrome();
        rp.reverse("corejava");
        rp.palindreome("madam");
    }
}
