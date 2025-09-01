package padmaja.java;

public class Task3divisibleby3 {
    public static void main(String[] args) {
        int count=0,sum=0;
        for(int i=3;i<=100;i=i+3)
        {
            System.out.println(i);
            count=count+1;
            sum=sum+i;
        }
        System.out.println("count="+count);
        System.out.println("sum="+sum);
    }
}
