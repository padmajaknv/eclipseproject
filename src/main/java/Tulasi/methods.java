package Tulasi;

public class methods {
    void sumof100naturalnumbers(){
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }




    public static void main(String[] args){
        methods a=new methods();
        a.sumof100naturalnumbers();

    }
}
