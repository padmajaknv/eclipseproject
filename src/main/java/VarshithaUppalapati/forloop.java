package VarshithaUppalapati;

public class forloop {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 3; i <= 100; i=i+3) {
            System.out.println("divisible by 3:" + i);
            count = count + 1;
            sum = sum + i;
        }
        System.out.println("count is:" + count);
        System.out.println("sum is:" + sum);
    }
}
