package padmaja.java;

public class task1 {
    public static void main(String[] args) {
        int age = 77;
        //char person='m';
        char person='f';
        boolean votercard=true;
        if(votercard==true && (age>=18) && (person=='f'||person=='F')){
            System.out.println("Women Eligible for voting");
            }

        else if(votercard==true && (age>=21) && (person=='m'||person=='M')){
                System.out.println("Men Eligible for voting");
            }

        else{
            System.out.println("Not Eligible for voting");
        }

 }
}



