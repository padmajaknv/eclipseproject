package Sangram;

public class Assignment3 {
    public static void main(String[] args){
        int count=0;
        int sum=0;
        for(int i=3;i<=100;i=i+3){
            System.out.println(i);
            count++;
            sum=sum+i;   //sum+=i;
        }
        System.out.println("Count is:"+count);
        System.out.println("Sum is:"+sum);
    }
}
