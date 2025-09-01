package padmaja.java;

public class arraycountusingmethods {
    void arraycount(char[] ch,char dup) {
             int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (dup == ch[j]) {
                    count = count + 1;
                }

        }
        System.out.println("Number of occurances for "+dup+" = " + count);
    }
        public static void main(String args[])
        {
            arraycountusingmethods x = new arraycountusingmethods();
            char[] ch = {'a', 'b', 'c', 'd','a','d','a','d','a'};
                    x.arraycount(ch,'c');
        }
}
