package haraprasad;

public class stringEvenOdd {
    void length(String a){
        int l=a.length();
        if(l%2==0) System.out.println("String is even");
        else System.out.println("String is odd");
    }
    public static void main(String[] args) {
        stringEvenOdd ans = new stringEvenOdd();
        ans.length("hara");
    }
}
