package JavaConcepts;

public class exceptionHandling1 {
    public static void main(String[] args) {
        int i = 4;
        int[] a = {6,7,8,9,0};
        System.out.println(0/i);
        System.out.println(i/4);
        try{
//            System.out.println(i/0);
            System.out.println(a[5]);
        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
            catch(Exception e){

            }
        finally{
            System.out.println("finally block");
        }
        /*
        finally block executes no matter the exception is handled or not
         */

        System.out.println("Hello World!!!");
    }
}
/*
Exception disturbs the flow of the execution of the program.
 */
/*
Unchecked Exceptions -
Ex: ArithmeticException, ArrayIndexOutOfBoundsException etc.,

Checked Exceptions-
 */