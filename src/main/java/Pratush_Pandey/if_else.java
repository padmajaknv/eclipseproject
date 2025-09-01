package Pratush_Pandey;
public class if_else {
    public static void main(String[] args) {
        int n=2,c=0;// Here You Have to Give the Value to the n
        c=n%2;
        if (c!=0){
            System.out.println("Wired");
        }
        else if(n<=5&&c==0){
            System.out.println("Not Wired");
        }
        else if (n<=20&&c==0){
            System.out.println("Wired");
        }
        else
            System.out.println("Not Wired");
    }

}

