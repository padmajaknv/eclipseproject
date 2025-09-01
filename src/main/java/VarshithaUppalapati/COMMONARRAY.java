package VarshithaUppalapati;

public class COMMONARRAY {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 5, 8, 4};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
        }
        int d[] = new int[count];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    d[c]=a[i];
                c++;
                }
            }
        }
        System.out.println("Common array values:");
        for (int i = 0; i < d.length; i++) {
        System.out.println(d[i]);
    }
}
}
