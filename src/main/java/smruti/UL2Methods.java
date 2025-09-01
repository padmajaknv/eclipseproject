package smruti;

public class UL2Methods {
        String tolower(String input) {
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    result += String.valueOf((char)(ch + 32));
                } else {
                    result += String.valueOf(ch);
                }
            }
            return result;
        }
        String toupper(String input) {
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    result += String.valueOf((char) (ch - 32));
                } else {
                    result += String.valueOf(ch);
                }
            }
            return result;
        }
        public static void main(String[] args) {
            UL2Methods f = new UL2Methods();
            String z = " heLLo i Am your NEw Friend";
            System.out.println("Lowercase: " + f.tolower(z));
            System.out.println("Uppercase: " + f.toupper(z));

        }
}

