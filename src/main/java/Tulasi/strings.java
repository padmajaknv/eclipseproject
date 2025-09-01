package Tulasi;

public class strings {
    int lengthofstring(String x) {

            String a = x;
            System.out.println(a.length());
            int len = a.length();
            if (len % 2 == 0) {
                System.out.println("length is even");

            } else {
                System.out.println("length is odd");
            }

        return len;
    }

    public static void main(String[] args) {
       String s="Java practice";
       strings obj=new strings();
       obj.lengthofstring(s);


    }
}
