package Bhanukrishna07;

public class CommonNumber {
    public static void main(String[] args) {
        int [] a={1,3,4,2,5};
        int [] b={9,4,6,2,5};
        int count=0;
        int k =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                }

            }
        }
        int [] c=new int[count];
        System.out.println("matching elements are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[k] = a[i];
                    k++;
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
