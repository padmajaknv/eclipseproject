package PRIYANSHU.MOCK_TEST;

import java.util.ArrayList;

public class ArrayListDublicate
{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);

        int n = al.size();

        for (int i=0; i <=n-2; i++)
        {
            for (int j =i+1; j<=n-1; j++)
            {
                if (al.get(i).equals(al.get(j)))
                {
                    System.out.println(al.get(i));
                }
            }
        }
    }
}

/*
public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int n = al.size();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(al.get(i).equals(al.get(j)))
                {
                    System.out.println(al.get(i));
                }
            }
        }

    }
 */

