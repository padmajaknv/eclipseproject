package samrat;

public class ForloopPrime {

    public static void main(String[] args){
        int sum=0;
        int i,j;
        for (i=2;i<=100;i++){
            for (j=2;j<=i;j++){
                if (i%j==0){
                    break;

                    }

                }
            if(i==j){
                System.out.println(i);
                sum=sum+i;

            }

        }
        System.out.println("The sum of the prime numbers 1 to 100 is "+ sum);
    }
}
