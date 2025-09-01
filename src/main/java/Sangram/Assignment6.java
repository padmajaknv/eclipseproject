package Sangram;

public class Assignment6 {
    public static void main(String[] args){
        int n = 11;
        int a = 0;
        int b = 1;
        int i = 0;

        while (i<n) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
