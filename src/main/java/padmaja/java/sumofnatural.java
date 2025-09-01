package padmaja.java;

public class sumofnatural {
    int sum = 0,s;
    void Sumnatural(int num) {
        for (int i = 1; i <= num; i++) {
            s=i*(i+1)/2;
        }
        System.out.println(s);

    }
    public static void main(String[] args) {
        sumofnatural s = new sumofnatural();
        s.Sumnatural(100);
    }
}

