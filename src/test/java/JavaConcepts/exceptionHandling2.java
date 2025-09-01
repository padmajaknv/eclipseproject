package JavaConcepts;

public class exceptionHandling2 {

    void a(int x) throws Exception{
        if(x<10){
            System.out.println("Hello World");
        }
        else{
            throw new Exception("My own exception");
        }
    }

    public static void main(String[] args) throws Exception{
//       try {
           Thread.sleep(10000);
//       }catch (Exception e){}
        System.out.println("Hello World!!!!");
        exceptionHandling2 e2 = new exceptionHandling2();
        e2.a(5);
        try {
            e2.a(10);
        }catch (Exception e){}
        System.out.println("End of the program");
    }
}

