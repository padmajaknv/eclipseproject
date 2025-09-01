package padmaja.java;

public class strlowertoupper {
    void ltou(String s){
        char[] ch=s.toCharArray();
        int k;
        for(char cc:ch)
        {
            if((cc>='a') && (cc<='z'))
            {
                k=(int)cc-32;
                char ab=(char)k;
                String ss = String.valueOf(ab);
                System.out.print(ss);
            }
            else
            {
                k=(int)cc+32;
                char az=(char)k;
                String sc = String.valueOf(az);
                System.out.print(sc);
            }
        }
    }
    public static void main(String[] args) {
        strlowertoupper l=new strlowertoupper();
        l.ltou("PADMaja");
    }
}

