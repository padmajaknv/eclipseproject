package VarshithaUppalapati;

public class conversionu {
    String a(String s) {
        char[] b = s.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 'a' && b[i] <= 'z') {
                b[i] = (char) (b[i]-32);
            }
        }
        String v = String.valueOf(b);
        System.out.println(v);
        return v;
    }

    public static void main(String[] args) {
        conversionu c = new conversionu();
        String s="varshitha";
        c.a(s);
    }
}






