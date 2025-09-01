package haraprasad;

public class sumEven {
    int even(int a){
        int sum=0;
        for(int i=0;i<=a;i+=2){
            sum+=i;
        }
        System.out.print("Sum ");
        return sum;
    }

    public static void main(String[] args) {
        sumEven s=new sumEven();
        int b=s.even(4);
        System.out.println(b);
    }
}
