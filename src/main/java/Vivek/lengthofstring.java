package Vivek;

public class lengthofstring {
    int stringlength(String s) {
        if(s.length()%2==0)
            System.out.println("String length is even");
        else System.out.println("String length is odd");
             return s.length();
    }

    public static void main(String[] args) {
        lengthofstring rt = new lengthofstring();
        String s="Helloworl";
        int length = rt.stringlength(s);
        System.out.println(length);







    }
}
