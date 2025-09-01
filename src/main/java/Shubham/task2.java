package Shubham;

public class task2 {
    public static void main(String[] args) {
        int count=0; int sum=0;
        for (int i = 3; i <= 100; i=i+3) {
            System.out.println(i);
            count++;
            sum += i;
        }
        System.out.println("Total count:" +count);
        System.out.println("Total sum: " + sum);
    }
}
