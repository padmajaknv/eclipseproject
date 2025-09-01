package Lakshmi;

public class Prime {
    public static void main(String[]args){
        int min=1;
        int max=100;
        int sum =0;
        int primecount=0;
        for(int num=min;num<=max;num++){
            if(num>1){
                int count=0;
                for(int i=1;i<=num;i++){
                    if(num%i==0){
                        count++;
                        sum=sum+i;
                    }
                }
                if(count==2){
                    System.out.println(num);
                    primecount++;
            }
        }
    }
        System.out.println("total count :"+primecount);
        System.out.println("total sum :"+sum);
    }
    }