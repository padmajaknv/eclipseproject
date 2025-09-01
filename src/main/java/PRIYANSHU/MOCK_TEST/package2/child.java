package PRIYANSHU.MOCK_TEST.package2;

import PRIYANSHU.MOCK_TEST.package1.parent;

public class child extends parent
{
    public static void main(String[] args)
    {
        child c = new child();
        c.z();
        c.d();
    }

    protected void d()
    {
        System.out.println("selenium");
    }
}

