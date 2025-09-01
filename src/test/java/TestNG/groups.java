package TestNG;

import org.testng.annotations.Test;

public class groups {
    @Test(groups="Smoke")
    public void a(){
        System.out.println("Void a");
    }

    @Test(groups = "Sanity")
    public void b(){
        System.out.println("Void b");
    }
}
