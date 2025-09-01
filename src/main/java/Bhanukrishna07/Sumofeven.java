package Bhanukrishna07;

public class Sumofeven {
    void a(int x){
        int sum=0;
        for(int i=0;i<=x;i=i+2){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum of even numbers:"+sum);
    }

    public static void main(String[] args) {
        Sumofeven even=new Sumofeven();
        even.a(20);
    }
}
