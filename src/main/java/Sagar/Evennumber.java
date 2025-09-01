package Sagar;

public class Evennumber {
    public static void main(String[] args){

        int n=7;

        if(n%2==1){
            System.out.println("odd Weird");
        }

        else if(n%2==0 && n>=2 && n<=5){
            System.out.println(" 2&5 Not Weird");
        }

        else if(n%2==0 && n>=6 && n<=20){
            System.out.println("6&20 Weird");
        }

        else if(n%2==0 && n>20){
            System.out.println("20 Not Weird");
        }
    }
}
