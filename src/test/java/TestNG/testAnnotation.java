package TestNG;

import org.testng.annotations.Test;

public class testAnnotation extends anotherClass{
    @Test(enabled = false)
    public void a(){
        System.out.println("Void a");
    }

    @Test(invocationCount = 10)
    public void b(){
        System.out.println("void b");
    }

    @Test(timeOut = 5000)
    public void c() throws Exception{
        Thread.sleep(5500);
        System.out.println("Void c");
    }

    @Test(dependsOnMethods = "e", alwaysRun = true)
    public void d(){
        System.out.println("Void d");
    }

}
