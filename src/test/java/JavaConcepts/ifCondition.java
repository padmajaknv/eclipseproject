package JavaConcepts;

public class ifCondition {
    public static void main(String[] args) {
      int a=2,b=3;
      int c=2;
      int g = a+c;
      float d=1.2f;
      float e = c+d;
      System.out.println(a+d);
      if(a>b){ //'if' block
          System.out.println("Hello World!!!");
      }
      if(a==b){
          System.out.println("a==b");
      }
      else{
          System.out.println("Else block");
      }
        System.out.println("===================");
      if(a>=b){
          System.out.println("a!=b");
      }
      else if(a<b){
          System.out.println("a<b");
      }
      else if(a<=b){
          System.out.println("a>=b");
      }
      else{
          System.out.println("Another else block");
      }
        System.out.println("Hi");
        System.out.println("======================");
        int age=10;
        boolean voterCard = true;
        if(age>=18 && (voterCard==true)){
            System.out.println("Eligible to vote");
        }
        else System.out.println("Not Eligible to Vote");
    }
}
