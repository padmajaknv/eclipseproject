package TestNG;

import org.testng.annotations.Test;

public class parallel {

    @Test
    void x() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void x");
    }

    @Test
    void c() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void c");
    }

    @Test
    void p() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void p");
    }

    @Test
    void b() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void b");
    }

    @Test
    void a() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void a");
    }

    @Test
    void d() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void d");
    }

    @Test
    void e() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void e");
    }

    @Test
    void z() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void z");
    }


}
