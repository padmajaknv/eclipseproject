package haraprasad;

public class searchArray {
    void search(int[] a,int b){
        int count=0;
        for(int i:a){
            if(i==b) count++;
        }
        if(a.length==0) System.out.println("Array is Empty.");
        else{
            if (count>0){
                System.out.println(b+" is present "+count+" times.");
            }
            else{
                System.out.println(b+" is not present in array.");
            }
        }
    }
    public static void main(String[] args) {
        int[] x={1,2,3,6,4,3,2,7,5,2};
//        int[] x={};
        int y=2;
        searchArray s = new searchArray();
        s.search(x,y);

    }
}
