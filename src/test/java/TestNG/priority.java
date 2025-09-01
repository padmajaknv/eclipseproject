package TestNG;

import org.testng.annotations.Test;

public class priority {
    @Test(priority=-1)
    void x(){
        System.out.println("Void x");
    }

    @Test(priority=1)
    void c(){
        System.out.println("Void c");
    }

    @Test(priority=0)
    void p(){
        System.out.println("Void p");
    }

    @Test(priority=1)
    void b(){
        System.out.println("Void b");
    }

    @Test(priority=5)
    void a(){
        System.out.println("Void a");
    }

    @Test(priority=3)
    void d(){
        System.out.println("Void d");
    }

    @Test(priority=4)
    void e(){
        System.out.println("Void e");
    }

    @Test(priority=2)
    void z(){
        System.out.println("Void z");
    }


}
