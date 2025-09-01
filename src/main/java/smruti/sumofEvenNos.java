package smruti;

public class sumofEvenNos {
    void sumeven(int x){
        int sum =0 ;
        for (int i =0;i<=x ;i+=2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumofEvenNos m = new sumofEvenNos();
        m.sumeven(8);

    }
}


// sum of  even numbers starting from 0