package TestNG;

import org.testng.annotations.Test;

public class sample2 extends reporting {
    @Test
    void c(){
        tests = reports.createTest("Test2","t2");
        System.out.println("Void c");
    }

    @Test
    void d(){
        System.out.println("void d");
    }

    @Test
    void e(){
        System.out.println("Void e");
    }
}
