package haraprasad;

public class vowelsCount {
    void vowel(String s){
        int count=0;
        char[] a={'A','E','I','O','U','a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            for(int j=0;j<a.length;j++){
                if(s.charAt(i)==a[j]){
                    count++;
                }
            }
        }
        if(count>1) System.out.println("String contains vowels "+count);
        else System.out.println("String contains no vowels.");
    }

    public static void main(String[] args) {
        vowelsCount v=new vowelsCount();
        v.vowel("hello I am Hapi.");
    }
}
