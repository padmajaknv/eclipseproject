package smruti;

public class sumNaturalNos {
    void sumNaturalNumbers(int x){
        int sum =0;
        for (int i =1 ; i<=x ; i++){
            sum = i*(i+1)/2;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumNaturalNos m = new sumNaturalNos();
        m.sumNaturalNumbers(100);

    }
}

