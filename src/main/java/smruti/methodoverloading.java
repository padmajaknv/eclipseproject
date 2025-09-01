package smruti;

public class methodoverloading {
    void sumeven(int x){
        int sum =0 ;
        for (int i =0;i<=x ;i+=2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    void sumeven(int x , int y){
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from " + x + " to " + y + " is: " + sum);
    }
    public static void main(String[] args) {
        methodoverloading m = new methodoverloading();
        m.sumeven(8);
        m.sumeven(4, 10);
    }
}


// sum of  even numbers starting from 0

