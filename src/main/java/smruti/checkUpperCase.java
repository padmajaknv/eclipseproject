package smruti;

public class checkUpperCase {
         int countUpper(String x) {
            int count = 0;
            for (int i = 0; i < x.length(); i++) {
                char ch = x.charAt(i);
                if (Character.isUpperCase(ch)) {
                    count++;
                }
            }
             if (count > 0) {
                 System.out.println("upper cases are " + count);
             } else {
                 System.out.println("no Upper cases");
             }
            return count;
        }

        public static void main(String[] args) {
            checkUpperCase f = new checkUpperCase();
            String z = "HeLLoWorLD";
            f.countUpper(z);

        }
}


