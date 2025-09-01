package Pratush_Pandey;

public class Array {
    public static void main(String[] args) {
        char []a={'A','B','C','D','E','F','G','H','I','J'};
        int c= a.length;
        int d,e=2;

        for (int i=1;i<a.length;i++){
           d=c%e;
            if (d==0){
               System.out.println(a[i]);
            }
              c--;
        }
    }
}
