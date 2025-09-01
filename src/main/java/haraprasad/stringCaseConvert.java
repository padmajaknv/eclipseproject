package haraprasad;

public class stringCaseConvert {
    void lower(String s){
        char[] l=s.toCharArray();
        String ss="";
        for(int i=0;i<l.length;i++){
            if(l[i]>='A' && l[i]<='Z'){
                int a=l[i]+32;
                l[i]=(char)a;
            }
            ss=ss.concat(String.valueOf(l[i]));
        }
        System.out.println(ss);
    }
    void upper(String s){
        char[] u=s.toCharArray();
        String ss="";
        for(int i=0;i<u.length;i++){
            if(u[i]>='a' && u[i]<='z'){
                int a=u[i]-32;
                u[i]=(char)a;
            }
            ss=ss.concat(String.valueOf(u[i]));
        }
        System.out.println(ss);
    }

    public static void main(String[] args) {
        stringCaseConvert c=new stringCaseConvert();
        String string="HapI";
        c.lower(string);
        c.upper(string);
    }
}
