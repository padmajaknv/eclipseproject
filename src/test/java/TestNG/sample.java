package TestNG;

import org.testng.annotations.Test;

//@Test
public class sample {

    @Test(groups = {"Smoke","Sanity"})
    void a(){
        System.out.println("Void a");
    }

    void b(){
        System.out.println("Void b");
    }
}
