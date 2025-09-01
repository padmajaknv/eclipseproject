package Snehitha;

public class votingeligibility {
    public static void main(String[]args){
        int age=7;
        boolean voter_card=true;
        char gender='M';
        char g='F';
        if(voter_card==true) {
            if((gender=='M'&&age>=21)||(g=='F'&&age>=18)){

            }else {
                System.out.println("not eligible");
            }
        }
        else{
            System.out.println("no voter card");
        }
    }
}


