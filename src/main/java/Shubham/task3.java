package Shubham;

public class task3 {
    public static void main(String[] args) {
        int count = 0; int sum = 0;
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.println(num);
                count++; sum += num;
            }
        }
        System.out.println("Total number of prime numbers: " + count);
        System.out.println("Sum of all prime numbers: " + sum);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
