package Bhanukrishna07;

public class privateclass {

    private String name;
    private int rollnum;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getrollnum(){
        return rollnum;
    }
    public void setrollnum(int rollnum){
        this.rollnum=rollnum;
    }
    private void showdetails(){
        System.out.println("Name:"+name+  ",Rollnum:"+rollnum);
    }
    public void getdetails(){
        showdetails();
    }
}

class Sample{
    public static void main(String[] args) {
        privateclass pc=new privateclass();
        pc.setname("Bhanu");
        pc.setrollnum(218);
        pc.getdetails();
    }
}
