package padmaja.java;

public class comparearrays {
    public static void main(String[] args) {
        int[] a={10,20,40,80,70};
        int[] b={20,40,50,70,50};
        int count = 0;
        int k=0;
        for(int i=0;i<a.length;i++)
         {
          for(int j=0;j<b.length;j++)
          {
            if(a[i]==b[j])//checking the common elements in both arrays
            {
              count++;
            }
          }
        }
        int[] c=new int[count];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    c[k]=a[i];
                    System.out.println("c["+k+"]="+c[k]);
                    k++;
                }
            }
        }
        System.out.println(c.length);
    }
}


