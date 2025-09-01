package padmaja.java;

public class Task5primenumber {
    public static void main(String[] args) {
        int count,sum=0,total=0;
        for (int num = 2; num <= 100; num++) {
            count=0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count = count + 1;
                }
            }
            if(count==2) {
                System.out.println(num);
                total++;
                sum=sum+num;
            }
        }
        System.out.println("total count="+total);
        System.out.println("sum="+sum);
    }
}


