package Snehitha;

public class divisibleby3 {
    public static void main(String[]args){
        int count=0;
        int sum=0;
        System.out.println("Numbers divisible by 3 from 1 to 100:");
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.print(i+" ");
                count=count+1;
                sum=sum+i;
            }
        }
        System.out.println("Numbers are divisible by 3:"+count);
        System.out.println("sum of the numbers divisible by 3:"+sum);


    }
}
