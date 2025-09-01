package VarshithaUppalapati;

public class method {

    void a(int y[]) {
       int sum=0;
        for (int i = 0; i <y.length; i++) {
            sum=y[i]+sum;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        method m = new method();
        int[] y = {1,2,3,4};
        m.a(y);
}
}
