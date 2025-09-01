package haraprasad;

public class countUpperCase {
    int s(String a){
        char[] arr=a.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countUpperCase c=new countUpperCase();
        int b=c.s("Hapi I");
        System.out.println(b);
    }
}
