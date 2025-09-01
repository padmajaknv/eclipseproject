package Akhil;

public class Prime_Number {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 100;
        int sum=0;
        int primecount=0;
        for (int num = n1; num <= n2; num++) {
            if (num > 1) {
                int count = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                        sum=sum+i;
                    }
                }
                if (count == 2) {
                    System.out.println(num);
                    primecount++;
                }
            }
        }
        System.out.println("Total prime numbers from 1 to 100 are :"+primecount);
        System.out.println("Total sum of prime numbers from 1 to 100 are :"+sum);
    }
}