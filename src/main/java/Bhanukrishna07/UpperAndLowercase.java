package Bhanukrishna07;

public class UpperAndLowercase {
    String upper(String x){
        char[] ch =x.toCharArray();
        String temp="";
        for (int i=0;i<ch.length;i++){
            ch[i]=(char)(ch[i]-32);
            temp=temp+ch[i];
        }return temp;
    }
    String lower(String x){
        char[] ch =x.toCharArray();
        String temp="";
        for (int i=0;i<ch.length;i++){
            ch[i]=(char)(ch[i]+32);
            temp=temp+ch[i];
        }return temp;
    }

    public static void main(String[] args) {
        UpperAndLowercase ul=new UpperAndLowercase();
        String u=ul.upper("javawithselenium");
        System.out.println("String convert into uppercase:"+u);
        String l=ul.lower("AUTOMATIONTESTING");
        System.out.println("String convert into lowercase:"+l);

    }
}
