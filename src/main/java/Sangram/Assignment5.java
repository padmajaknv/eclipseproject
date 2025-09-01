package Sangram;

public class Assignment5 {
    public static void main(String[] args){
        int reversed = 0;

        for (int num=20067 ; num>0 ; num=num/10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed number:"+reversed);
    }
}
