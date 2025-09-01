package Vivek;

public class ifelsecondition {

    public static void main(String[] args){

        int age=21;
        boolean votercard=true;
        char Gender='M';

        if(age>=18 && votercard && (Gender=='F')){
            System.out.println("Girls You are eligible to vote");
        }


        else if(age>=21 && votercard && (Gender=='M')){
            System.out.println("Boys You are eligible to vote");
        }

        else {
            System.out.println("You are not eligible to vote");
        }

    }
}
