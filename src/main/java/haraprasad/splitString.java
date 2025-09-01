package haraprasad;

public class splitString {
    int s(String a){
        String[] b=a.split("");
        return b.length;
    }

    public static void main(String[] args) {
        splitString ss=new splitString();
        int a = ss.s("ABCDabcdBBCccb");
        System.out.println(a);
    }
}
