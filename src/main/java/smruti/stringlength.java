package smruti;

public class stringlength {
    int stringL(String x) {
        if (x.length() % 2 == 0) {
            System.out.println("string length is even and length is "+x.length());
            return x.length();
        } else {
            System.out.println("string length is odd and the length is  "+x.length());
            return x.length();
        }
    }

    public static void main(String[] args) {
        stringlength m = new stringlength();
        m.stringL("smruti 12");
    }
}

// write  a method to calculate the length of the string  and  check length is even or odd
