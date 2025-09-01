package padmaja.java;

public class noofvowels {
    void vowels(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++) {
            char[] ch={'a','e','i','o','u','A','E','I','O','U'};
            for(int j=0;j<ch.length;j++) {
                if (s.charAt(i) == ch[j]) {
                    count = count + 1;
                }
            }
        }
        System.out.println("No of vowels in "+s+" = "+count);
    }
    public static void main(String[] args)
    {
        noofvowels v=new noofvowels();
        v.vowels("ABBXXEEUui");
    }
}
