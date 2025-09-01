package Sangram;

public class Assignment2 {
    public static void main(String[] args){

        int age=29;
        char gen1='M';
        char gen2='F';
        boolean votercard=true;

        if(age>=21 && votercard==true && gen1=='M' && gen2=='F' ){
            System.out.println("Both are eligible for vote");

        }
        else if (age>=18 && votercard == true && gen1=='M' ){
            System.out.println("Females are eligible for vote");
        }
        else {
            System.out.println("Not eligible for vote");

        }
    }
}
