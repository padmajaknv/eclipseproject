package haraprasad;
//write a method to find the no of occurentances of  a substring
public class subStringFind {
    void Find(String a,String b){
        int count;
        String[] arr=a.split(b);
        count=arr.length;
        if(count>0){
            System.out.println(b+" is present "+count+" times in String.");
        }
        else System.out.println("Substring not present");
    }
    public static void main(String[] args) {
        subStringFind s= new subStringFind();
        String a = "hapi is today hapi";
        String b = "hapi";
        s.Find(a,b);
    }
}
