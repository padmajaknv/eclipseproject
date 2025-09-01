package smruti;

public class stringpalindrome {
    void checkpalindrome(String x) {
        String r = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            r += x.charAt(i);
        }
        if (x.equals(r)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public static void main(String[] args) {
        stringpalindrome f = new stringpalindrome();

        f.checkpalindrome("mom");
        f.checkpalindrome("hello");
    }

}
