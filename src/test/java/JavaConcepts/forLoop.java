package JavaConcepts;

public class forLoop {
    public static void main(String[] args){
        int count=0, count1=0, count2=0;
        for(int i=1;i<=10;i++){
            System.out.println("Hi");
        }
        System.out.println("=============");
        for(int i=0;i<10;i=i+2){
            System.out.println(i);
        }
        System.out.println("=============");
        for(int i=0;i<=10;i=i+3){
            System.out.println(i);
            count++;
        }
        System.out.println("Count is: "+count);
//        for(int i=1;i>0;i++){
//            System.out.println(i);
//        }
        for(int i=1;i>2;i++){
            System.out.println("Hey");
        }
        System.out.println("===============");
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
        System.out.println("===============");
        for(double i=5;i>0;i=i/2){
            System.out.println(i);
            count1++;
        }
        System.out.println("Count is : "+count1);
        System.out.println("==================");
        for(int i=5;i<=50;i=i+5){
            System.out.println(i);
            count2++;
        }
        System.out.println("Count is : "+count2);

        System.out.println("===Nested Loop===");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
