package Bhanukrishna07;

public class Twodimensional {
    public static void main(String[] args) {
        int [][] a={{2,3},{4,5}};
        // or we can assign these way
//        int[][] a= new int[2][2];
//       a[0][0]=2;
//       a[0][1]=4;
//       a[1][0]=3;
//       a[1][1]=5;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
           System.out.println();
        }

    }
}
