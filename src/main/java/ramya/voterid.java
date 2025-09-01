package ramya;

public class voterid {
    public static void main(String[] args) {
        // boolean votercard = true;
        char malegender = 'M';
        char femalegender = 'F';
        int maleage = 22;
        int femaleage = 18;
        if ((femalegender == 'F') || (femalegender == 'f')) {
            if (femaleage >= 18) {
                System.out.println("eligible for voting");
            } else if (femaleage < 18) {
                System.out.println("not eligible for voting");
            }
        }
        if ((malegender == 'm') || (malegender == 'M')) {
            if (maleage >= 22) {
                System.out.println("eligible for voting");
            } else if (maleage < 22) {
                System.out.println("not eligible for voting");
            }
        }

    }
}

