package padmaja.java;

public class substringoccu {
    void sub(String s,String substr)
    {
        int count;
        if(s.contains(substr)){
            String[] xy=s.split("pad");
            count=xy.length-1;
            System.out.println("No of "+substr+" occurrences in "+s+" = "+count);
        }
        else {
            System.out.println("substrg is not present");
        }
    }
    public static void main(String[] args)
    {
        substringoccu v=new substringoccu();
        v.sub("padmapadmapadmapadmajapadmajapadmaja","pad");
    }
}