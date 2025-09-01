package Bhanukrishna07;

public class Sumvalues {

    void sum(int x, float y,char c) {
        int sum=0 ;
        sum=(int)(sum+x+y+c);
        System.out.println(sum);

    }
       void repeat(int [] x,int y) {
           int count = 0;
           for (int i = 0; i < x.length; i++) {
               if (x[i] == y) {
                   count++;
               }
           }
           System.out.println("Number of times repeated :" +count);
       }
       void sumarray(int [] x){
        int sum=0;
        for(int i=1;i<x.length;i++){
            sum=sum+x[i];
            }
           System.out.println("sum of numbers in array:"+sum);
        }


    public static void main(String[] args) {
        Sumvalues s=new Sumvalues();
        s.sum(5,5.8f,'A');
        int []x={2,3,4,2,6,7,8,6,4,2,2};
        s.repeat(x,2);
        s.sumarray(x);
        s.repeat(x,9);
    }
}
