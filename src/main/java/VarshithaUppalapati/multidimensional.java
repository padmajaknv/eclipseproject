package VarshithaUppalapati;

public class multidimensional {
    public static void main(String[] args) {
        int[][] c= new int[2][2];
        c[0][0]=0;
        c[0][1]=1;
        c[1][0]=2;
        c[1][1]=3;
        int cLength = c.length;

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+"   ");
            }
            System.out.println(" ");
        }

    }
}