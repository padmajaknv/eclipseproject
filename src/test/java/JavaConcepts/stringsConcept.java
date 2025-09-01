package JavaConcepts;

public class stringsConcept {

    int strLength(String s){
        if(s.length()%2==0) System.out.println("String length is even");
        else System.out.println("String length is odd");
        return  s.length();
    }

    public static void main(String[] args) {
        String s = "Quality Thought"; //literal
        String ss = new String("Ameerpet"); //object

        System.out.println(s.hashCode());
        s = s.toLowerCase();

        System.out.println(s.hashCode());

        //Strings are immutable
        String uc = s.toUpperCase();
        System.out.println(uc);
        String lc = s.toLowerCase();
        System.out.println(lc);
        System.out.println(s.indexOf("t"));
        System.out.println(s.lastIndexOf("t"));
        int length = s.length();
        System.out.println(length);
        char c = s.charAt(0);
        System.out.println(c);
//        System.out.println(s.charAt(15));
        boolean starts = s.startsWith("q");
        System.out.println(starts);
        boolean ends = s.endsWith("t");
        System.out.println(ends);
        stringsConcept sc = new stringsConcept();
        int i = sc.strLength("QT");
        System.out.println(i);
        boolean contains = s.contains("lity");
        System.out.println(contains);
        boolean equals = s.equals("quality thought");
        System.out.println(equals);
        boolean e = s.equalsIgnoreCase("quality thought");
        System.out.println(e);
        String sub1 = s.substring(3,8);
        System.out.println(sub1);
        String sub2 = s.substring(8);
        System.out.println(sub2);
        String x = " h i ";
        System.out.println(x.length());
        x = x.trim();
        System.out.println(x.length());
        String y = "500";
        System.out.println(y+10);
        int z = Integer.parseInt(y);
        System.out.println(z+10);
        float xx = Float.parseFloat(y);

        char[] ch = s.toCharArray();
        for(char cc:ch){
            System.out.print(cc+"\t");
        }
        char yy = 'c';
        char zz = 'd';
        System.out.println(yy+zz);
//        String ab = String.valueOf(yy)+String.valueOf(zz);
        String ab = String.valueOf(yy).concat(String.valueOf(zz));
        System.out.println(ab);

        String[]  xy = s.split(" ");
        for(String yz: xy){
            System.out.println(yz);
        }

        String bs = "Hi Hello Hello Hi Hi";
//        String[] css = bs.split("Hi");
        String[] css = bs.split("Hello");
        System.out.println(css.length);
        for(String da:css){
            System.out.println(da);
        }

        char chh = 1;
        char chh2 = '1';
        System.out.println(Character.isDigit(chh));
        System.out.println(Character.isDigit(chh2));
        float ii = 6.2f;
        int iii = Math.round(ii);
        System.out.println(iii);
    }
}
