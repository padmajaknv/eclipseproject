package smruti;

public class votingage {
    public static void main(String[] args){
        int a =  10;
        boolean votercard = true;
        char c = 'm' , d='f' ;
         if (a>=21 && votercard && c=='m' && d=='f' ){
            System.out.println(" eligible as man as well as female ");
        }
         else if (a>=18 && votercard && d =='f' ){
             System.out.println("eligible as female  ");
         }
          else {
            System.out.println("both are not eligible");
        }
    }
}
// without using scanner
// 18 years  to pass the


// if char is m  = 21  and satisfies all condition
// if char is f = 18 and satisfies all condition