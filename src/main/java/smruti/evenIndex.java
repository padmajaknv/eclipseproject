package smruti;

public  class evenIndex {
    void evenindexofarray(int[] x){
        for(int j=0 ; j<x.length; j+=2 ){
            System.out.println(x[j]);

        }

    }
    public static void main(String[] args) {
        evenIndex m = new evenIndex();
        int[] x ={1,2,3,4,5,6};
        m.evenindexofarray(x);


    }


    }





// print the elements of the even index in the  array  and the array should be user choice

//  methods only  from now on

//   search the number inside the array and tell how many times that number is present  ,
//   if any  numbers are not present thn print not present inside the array then  print its not present
