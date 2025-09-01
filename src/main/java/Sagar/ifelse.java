package Sagar;

public class ifelse {

        public static void main(String[] args){

            int age=21;
            boolean votercard=true;
            char Gender='m';

            if(age>=18 && votercard && (Gender=='F'||Gender=='f')){
                System.out.println("Girls You are eligible to vote");
            }


            else if(age>=21 && votercard && (Gender=='M'||Gender=='m')){
                System.out.println("Boys You are eligible to vote");
            }

            else {
                System.out.println("You are not eligible to vote");
            }

        }

    }

