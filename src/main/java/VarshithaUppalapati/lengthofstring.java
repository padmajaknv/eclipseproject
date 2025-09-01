package VarshithaUppalapati;

public class lengthofstring {
    int stringlength(String s) {
        if (s.length() % 2 == 0) {
            System.out.println(" string length is even");
        } else {
            System.out.println("odd");
        }
        return s.length();
    }

        public static void main (String[]args){
            String s = "Varshitha";
            lengthofstring rt=new lengthofstring();
            int length = rt.stringlength(s);
            System.out.println(length);
        }
    }
