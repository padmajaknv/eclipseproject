package VarshithaUppalapati;

public class primes {

        public static void main(String[] args){
            int sum=0;
            int count=0;
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
                    count++;
                    System.out.println(i+" is prime");

                }
            }
            System.out.println( "sum of prime numbers is " +sum);
            System.out.println( "count of prime numbers  is " +count);
        }
    }

