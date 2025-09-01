package Sangram;

public class Assignment9{
    public static void main(String[] args){
        char ch ='S';
        if (ch>='A' && ch<='Z'){
            ch =(char)(ch+32);
            System.out.println("Converted to lowercase:"+ch);
        }
        else if(ch>='a' && ch<='z'){
            ch=(char)(ch-32);
            System.out.println("Converted to uppercase:"+ch);
        }
        else{
            System.out.println("Not a alphabetic character.");
        }
    }
}
