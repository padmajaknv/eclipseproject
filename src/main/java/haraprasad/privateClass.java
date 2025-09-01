package haraprasad;

public class privateClass {
    private String name;
    private int rollNo;
    public void name(String n){
        name=n;
    }
    public void rollno(int r){
        rollNo=r;
    }
    private void print(){
        System.out.println("Name: "+name+" ,RollNo: "+rollNo);
    }
    public void details(){
        print();
    }
}

class details{
    public static void main(String[] args) {
        privateClass pv=new privateClass();
        pv.name("Hara");
        pv.rollno(4);
        pv.details();
    }
}
