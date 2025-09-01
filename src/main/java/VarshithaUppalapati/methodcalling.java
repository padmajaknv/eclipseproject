package VarshithaUppalapati;

public class methodcalling {

    void search(int a[], int b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
           if (count == 0) {
                System.out.println("number not present in array");
            }
        }
        System.out.println(b + "========" + count);
    }
    public static void main(String[] args) {
        methodcalling m = new methodcalling();
        int[] a = {11, 12, 13, 14, 15};
        int b = 15;
        m.search(a, b);
    }
}