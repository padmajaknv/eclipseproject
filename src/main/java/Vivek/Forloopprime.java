package Vivek;

public class Forloopprime {

    public static void main(String[] args){
        int sum=0;
        int i;
        int j;
        for( i=2;i<=100;i++)
        {
        for(j=2;j<=i;j++)
            {
                if (i%j == 0) {
                    break;
                }
            }

            if(i==j)
            {
                sum=sum+i;
                System.out.println( i+"is prime number");

            }
        }
        System.out.println( "sum of prime numbers less than 100 is " +sum);
    }
}
