package padmaja.java;

public class strnumbecount {
    void numbercount() {
        String s = "P40AD20maja";
        char x;
        int count = 0;
        char[] ch = s.toCharArray();
        for (char cc : ch) {
            if (((int) cc >= 48) && ((int) cc <= 57)) {
                count++;
            }
        }
        System.out.println(count);
        if(count==0)
        {
            System.out.println("String do not contains numbers");
        }
    }
    public static void main(String[] args) {
        strnumbecount s = new strnumbecount();
        s.numbercount();
    }
}

