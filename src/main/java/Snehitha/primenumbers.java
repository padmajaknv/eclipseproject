package Snehitha;

public class primenumbers {
    public static void main(String[] args){
        int count=0;
        int sum=0;
        System.out.println("prime numbers from 1 to 100:");
        for(int num=2;num<=100;num++){
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
                count=count+1;
                sum=sum+num;
            }
        }
        System.out.println("\ntotal prime numbers:"+count);
        System.out.println("sum of prime numbers:"+sum);
    }
}

