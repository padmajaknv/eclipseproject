package smruti;
//write  a method to count the no of vowels in the string vowels can in lower case or be upper case in a string

public class vowelscount {
    void stringL(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char a = x.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("vowels are " + count);
        } else {
            System.out.println("no vowels found");
        }
    }

    public static void main(String[] args) {
        vowelscount m = new vowelscount();
        String z = "hello i am smruti";
        m.stringL(z);
    }
}


