package JavaConcepts;

public class thisKeyword {
    int i = 5;

    thisKeyword(int i){
        this.i = i;
        System.out.println(i);
    }

    public static void main(String[] args) {
        thisKeyword tk = new thisKeyword(6);
        System.out.println(tk.i);
    }
}
