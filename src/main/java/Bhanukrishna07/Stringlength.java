package Bhanukrishna07;

public class Stringlength {

    int a(String x) {
        int len = x.length();
        if (len % 2 == 0) {
            System.out.println("Stirng length is even");
        } else {
            System.out.println("String length is odd");
        }
        return x.length();
    }
    public static void main(String[] args) {

        Stringlength ln=new Stringlength();
        int x=ln.a("Quality");
        System.out.println(x);
    }
}
