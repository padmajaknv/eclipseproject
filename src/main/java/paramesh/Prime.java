package paramesh;

public class Prime {

    public static void main(String[] args){
        int count=0,sum=0;
        for(int i=3;i<=100;i=i+3){

            System.out.println("Number divisible by 3 are "+ i);
            sum=sum+i;
            count++;

        }
        System.out.println("count "+ count++);
        System.out.println("sum of numbers "+ sum);
    }
}
