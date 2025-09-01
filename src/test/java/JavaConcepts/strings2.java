package JavaConcepts;

public class strings2 {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello World!!!");
        StringBuilder sbl = new StringBuilder("Quality Thought");

        System.out.println(sbf.hashCode());
        String s = "Hi";
        StringBuffer sbf2 = new StringBuffer(s);
        sbf2.reverse();
        s = sbf2.toString();

        sbf= sbf.reverse();
        System.out.println(sbf);
        System.out.println(sbf.hashCode());
        System.out.println(sbf.length());
        System.out.println(sbf.charAt(4));
        System.out.println(sbf.append(" Hi"));
        System.out.println(sbf.insert(8,"QT"));
        sbf.deleteCharAt(3);
        sbf.delete(0,5);
        System.out.println(sbf);
    }
}
