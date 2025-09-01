package smruti;

public class findnumberupper {
    void countCharacters(String str) {
        int u = 0;
        int l = 0;
        int d = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                u++;
            }
            else if (Character.isLowerCase(ch)) {
                l++;
            }
            else if (Character.isDigit(ch)) {
                d++;
            }
        }
        if (u > 0 || l>0 || d>0 ){
            System.out.println("Uppercase " + u);
            System.out.println("Lowercase " + l);
            System.out.println("Digits " + d);
        }
        else {
            System.out.println("string is empty");
        }
    }
    public static void main(String[] args) {
        findnumberupper m = new findnumberupper ();
        String z = " Hello SIR its 2025 ";
        m.countCharacters(z);
    }
}
