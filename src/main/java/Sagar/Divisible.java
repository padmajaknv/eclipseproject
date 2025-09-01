package Sagar;

public class Divisible {
    public static void main(String[] args){
        int count=0,sum=0;
        for(int i=3;i<100;i=i+3){
                    System.out.println(i);
                    count++;
                    sum= sum+ i;

        }
        System.out.println("Count of numbers which are divisible by 3 is " + count);
        System.out.println("Sum of numbers which are divisible by 3 is " + sum);

}
}






