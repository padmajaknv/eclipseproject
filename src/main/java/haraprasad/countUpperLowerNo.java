package haraprasad;

public class countUpperLowerNo {
    void count(String s){
        int c1=0,c2=0,c3=0;
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>='A' && a[i]<='Z') c1++;       //count upper
            else if(a[i]>='a' && a[i]<='z') c2++;  //count lower
            else if(a[i]>='0' && a[i]<='9') c3++;  //count number

        }
        System.out.println("No of Upper Case: "+c1);
        System.out.println("No of Lower Case: "+c2);
        System.out.println("No in String: "+c3);
    }
    public static void main(String[] args) {
        countUpperLowerNo c=new countUpperLowerNo();
        c.count("HApii12340");
    }
}
