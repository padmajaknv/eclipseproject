package Bhanukrishna07;

public class Divisible3 {
    public static void main(String[] args){
        int sum=0;
        int count=0;
        for(int i=3;i<=100;i=i+3){
            System.out.println(i);
            sum=sum+i;
            count++;
        }
    System.out.println("Total Sum of numbers from 1 to 100 divisible by 3:"+ sum);
    System.out.println("Total count of numbers from 1 to 100 divisible by 3:"+count);

    }
}
