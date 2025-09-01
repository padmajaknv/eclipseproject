package padmaja.java;

public class taskarray {
   void even(char[] a){
       for(int i=2;i<a.length;i=i+2)
       {
           System.out.println(a[i]);
       }
   }
    public static void main(String[] args) {
       taskarray x=new taskarray();
       char[] a ={'a','b','c','d','e','f','g','h','i','j'};
        x.even(a);
    }
}
