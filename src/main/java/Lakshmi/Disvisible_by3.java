package Lakshmi;

public class Disvisible_by3 {

    public static void main(String[] args){
        int count=0;
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println(i);
                count++;
                sum=sum+i;
            }
        }
      System.out.println("total count:"+count);
        System.out.println("total sum:"+sum);
    }
}
