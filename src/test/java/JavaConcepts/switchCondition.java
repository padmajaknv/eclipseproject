package JavaConcepts;

public class switchCondition {
    public static void main(String[] args) {
        int a=1,b=2;
        switch (a+b){ //switch (condition)
            case 0:  //if ((a+b)==0)
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Incorrect value");
                break;
        }
        System.out.println("Outside Switch Block");
        System.out.println("Hi");
    }
}
