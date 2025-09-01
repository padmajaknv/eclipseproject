package Bhanukrishna07;

public class Ifcondition {
    public static  void main(String[] args){

        int n=52;
        if(n%2!=0){
            System.out.println("Given number is print Weird");

        }
        else if(n%2==0 &&  n >= 2 && n <= 5){

            System.out.println("given number is Not Weird 1 if else");
        }
        else if((n%2==0 &&  n >= 6 && n <= 20)){
            System.out.println("given number is print Weird 2 if else");
        }
        else if (n%2==0 && n<=50) {
            System.out.println("given number is Not Weird 3 if else");
        }
        else{
            System.out.println("given number is more than 50");
            }

        }
    }

