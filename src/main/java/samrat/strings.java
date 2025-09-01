package samrat;

public class strings {
    int Strlenght(String s) {
        if (s.length() % 2 == 0)
            System.out.println("String length is even");
        else
            System.out.println("string length is odd");
        return s.length();

    }
    public static void main(String[]args){
        strings s = new strings();
        s.Strlenght("welcome");
        s.Strlenght("quality thought");
        s.Strlenght("ameerpet");

    }
}


