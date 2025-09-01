package Bhanukrishna07;

public class Prime_Num {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int sum=0;
        int primecount=0;
        for (int num = min; num <= max; num++) {
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
        System.out.println("Total prime numbers between 1 to 100 are :"+primecount);
        System.out.println("Total sum of prime numbers between 1 to 100 is:"+sum);
}
}