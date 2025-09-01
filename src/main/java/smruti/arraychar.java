package smruti;

public class arraychar {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d','e','f','g','h','i','j'};
        int alen=a.length;
        for (int i=0 ; i<a.length ; i++ ) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }


    }
}



// write the character array  of 10 range ,  print the even index

