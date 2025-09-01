package haraprasad;

public class reverseString {
    void reverse(String s){
        char[] a=s.toCharArray();
        String reverse="";
        for(int i=a.length-1;i>=0;i--){
            reverse+=a[i];
        }
        System.out.println("Reverse of String: "+reverse);
    }

    public static void main(String[] args) {
        reverseString a=new reverseString();
        a.reverse("Haraprasad");
    }
}
