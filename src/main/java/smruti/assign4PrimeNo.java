package smruti;// count all the primes numbers between 1 - 100 then calculate all the sum  of total prime numbers

public class assign4PrimeNo {
    public static void main(String[] args) {
        int c =0;
        int s=0;
        for (int i = 2 ; i<=100 ; i++ ){
            int count =0;
            for (int j =1 ; j <=i ; j++){
                if(i %j == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
                c++;
                s+=i;
            }
        }
        System.out.println("count is " +c);
        System.out.println("sum is " +s);

    }
}
