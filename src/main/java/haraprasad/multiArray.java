package haraprasad;

public class multiArray {
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        a[0][0] = 5;
        a[0][1] = 6;
        a[0][2] = 7;
        a[1][0] = 8;
        a[1][1] = 9;
        a[1][2] = 4;

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
