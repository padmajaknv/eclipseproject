package JavaConcepts;

public class forEachLoop {
    public static void main(String[] args) {
        /*
        for each loop can be used only on data structures
         */
        int[] a = {6,7,8,9,10,11};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("================");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
        System.out.println("================");
        for(int b: a){
            System.out.println(b);
        }
    }
}
