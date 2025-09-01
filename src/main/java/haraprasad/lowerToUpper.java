package haraprasad;

public class lowerToUpper {

    void caseconvert(char a){
        if(a>='a' && a<='z'){
            int r=a-32;
            char x=(char)r;
            System.out.println(x);
        }
        else if(a>='A' && a<='Z'){
            int r=a+32;
            char y=(char)r;
            System.out.println(y);
        }
        else System.out.println("Give valid Alphabet");
    }
    
    public static void main(String[] args) {
        lowerToUpper m=new lowerToUpper();
        m.caseconvert('H');
    }
}
