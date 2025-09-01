package padmaja.java;

public class struppercount {
    void upper(){
        String s="PADmaJa";
        char x;
        int count=0;
        char[] ch = s.toCharArray();
        for(char cc:ch){
            if ((cc >= 'A') && (cc <= 'Z')) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        struppercount s=new struppercount();
        s.upper();

    }
}