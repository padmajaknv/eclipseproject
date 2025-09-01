package Bhanukrishna07;

public class Vote {
    public static void main(String[] args) {
        int maleage = 23;
        int femaleage = 18;
        boolean votercard = true;
    if(maleage >= 21 && femaleage>= 18 && votercard==true)  {
        System.out.println("They are eligible for vote");
    }
   else if(femaleage>=18 && votercard==true){
       System.out.println("she is eligible for vote");
    }
   else if (maleage>=21 && votercard==true ) {
       System.out.println("he is eligible for vote");
   }
   else {
       System.out.println("They are not eligible for vote");
    }
    }

}
