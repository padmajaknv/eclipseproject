package haraprasad;

public class commonArray {
    public static void main(String[] args){
        int[] a = {1,3,2,3,4,5,6};
        int[] b = {2,3,6,7,8};
        int count = 0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }

        int index=0;
        int[] c = new int[count];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[index]=a[i];
                    index++;
                }
            }
        }

        for(int x=0;x<count;x++){
            System.out.print(c[x]+ " ");
        }
        System.out.println("\nLength of array:"+c.length);
    }
}

//Common Array