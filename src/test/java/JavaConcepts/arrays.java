package JavaConcepts;

public class arrays {
    /*
    Arrays are used for storing multiple values of the same data type.

    Array Indexes always start from 0.
    Maximum Index is always ArrayLength - 1.
    Array Index cannot be negative.
     */
    public static void main(String[] args){
        int x = 1;
        int[] a = new int[5];
        float[] b = {1.2f,0.0324f,9.4f,0.345f,9.345f,2.4f};
        int bLength = b.length;
        System.out.println(x);
        System.out.println(a[3]);
        a[0] = 6;
        a[1] = 7;
        a[2] = 8;
        a[3] = 9;
        a[4] = 10;
//        a[5] = 11;
        System.out.println(a[4]);
//        System.out.println(a[5]);
        System.out.println("hi");
        System.out.println(a[2]);

//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
//        System.out.println(b[3]);
//        System.out.println(b[4]);

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("================");
        for(int i=b.length-1;i>=0;i-- ){
            System.out.println(b[i]);
        }

        int[][] c = new int[2][2];
        c[0][0] = 9;
        System.out.println(c[0][0]);
//        int[][] d = {{1,2},{5,3},{6,4}};
//        System.out.println(d.length);
//        System.out.println(d[0][1]);
//        System.out.println(d[2][1]);

        int[][] d = {{1,2,3},{4,5,6}};
        System.out.println(d[1][1]);
    }
}
