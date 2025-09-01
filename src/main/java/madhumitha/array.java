package madhumitha;

public class array {
    public static void main(String[] args) {
        char a[]  = {'a','b','c','d','e','f','g','h','i','j'};
        int length=a.length;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.println(a[i]);

            }
        }

    }
}
