package VarshithaUppalapati;

public class arrays {
    public static void main(String[] args) {
        char[] a = {'v', 'a', 'r', 's', 'h', 'i', 't', 'h', 'a'}; //assigning name to character
        int aLength = a.length;
        for (int i = 0; i < a.length; i+=2) {
            System.out.println(a[i]);
        }
    }
}