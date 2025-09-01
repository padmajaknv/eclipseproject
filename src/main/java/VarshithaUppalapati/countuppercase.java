package VarshithaUppalapati;

public class countuppercase {
    void a(String s){
        int count=0;
        char[]b=s.toCharArray();
        for(int i=0;i<b.length;i++){
            if(b[i]>='a'&& b[i]<='z'){
                count++;

            }

        }
        System.out.println(+count);
    }

    public static void main(String[] args) {
        countuppercase u=new countuppercase();
        String s="VarsHITHa";
        u.a(s);

    }
}
