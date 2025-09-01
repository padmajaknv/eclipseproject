package ramya;

public class array_twoarray {
    public static void main(String[] args){
        int []a= {1,2,3,4,5,6};
        int []b={2,4,6,8,10,1};
        int[]c=new int[a.length];
         for(int i=0;i<a.length;i++){
         for(int j=0;j<b.length;j++){
             if(a[i]==b[j]){
                 c[i]=a[i];
                 System.out.println(c[i]);
             }
         }

         }
    }
}
