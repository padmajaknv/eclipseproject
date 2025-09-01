package padmaja.java;
//Reversing a string using string buffer and builder classes
public class reversestring {
    void revstr(String s){
        StringBuffer sbf=new StringBuffer(s);
        StringBuilder sbu=new StringBuilder(s);
        sbf.reverse();
        sbu.reverse();
        System.out.println(sbf);
        System.out.println(sbu);
        }
    public static void main(String[] args) {
        reversestring rev=new reversestring();
        rev.revstr("padmaja");

    }
}
