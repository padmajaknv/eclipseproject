package padmaja.java;

public class task7multidimenarray {
    public static void main(String[] args) {
    int[][] a = new int[2][2];
    a[0][0]=2;
    a[0][1]=3;
    a[1][0]=4;
    a[1][1]=5;
    for(int i=0;i<a.length;i++)
    {
       for(int j=0;j<a.length;j++)
       {
           System.out.println("a["+i+"]["+j+"]="+a[i][j]);
       }
    }

    }
}
