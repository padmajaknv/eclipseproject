package haraprasad;

public class charArray {
    public static void main(String[] args) {
        char[] a= {'h','a','r','a','p','r','a','s','a','d'};
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
