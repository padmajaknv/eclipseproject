package haraprasad;

public class evenIndexArray {
    void even(int[] a){
        if(a.length!=0){
            for(int i=0;i<a.length;i+=2){
                System.out.print(a[i]+" ");
            }
        }
        else System.out.println("No value in Array.");
    }

    public static void main(String[] args) {
        evenIndexArray a= new evenIndexArray();
        int[] b={1,2,3,4,5,6,7,8,9};
        a.even(b);
    }
}
