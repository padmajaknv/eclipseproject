package madhumitha;

public class ifelsehackerrank {
    public static void main(String[] args) {
        int a=10;
        if(a%2!=0){
            System.out.println("Weird");
        }else if(a>=2 && a<=5 && a%2==0){
            System.out.println("Not Weird");
        }else if(a>=6 && a<=20 && a%2==0){
            System.out.println("Weird");
        }else if(a>=20 && a%2==0){
            System.out.println("Not Weird");
        }
    }
}
