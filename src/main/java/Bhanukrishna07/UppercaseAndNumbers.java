package Bhanukrishna07;

public class UppercaseAndNumbers {
    int uppercase(String x){
        int count=0;
        char [] ch=x.toCharArray();
        for(char c:ch){
            if(c>='A'&&c<='Z'){
                count++;
            }
        }
        System.out.println("number of uppercaselaters in a string :"+count);
        return count;
    }
    int numbers(String x){
        int count=0;
        char[] a=x.toCharArray();
        for(char ch:a){
            if(ch>='0'&&ch<='9'){
                count++;
            }
        }
        System.out.println("Numbers in given a String:"+count);
        return count;
    }
    public static void main(String[] args) {
        UppercaseAndNumbers r=new UppercaseAndNumbers();
        r.uppercase("AbCsAdsGjI");
        r.numbers("Ab1H2c7d6t");
    }
}
