package Snehitha;

public class vowelcount {
    public static void main(String[] args) {
        String sa = "Quality Thought";
        int count = 0;

        for (int i = 0; i <sa.length(); i++) {
            {
                char c = sa.charAt(i);
                if (c=='a' || c=='e' || c =='i' || c=='o' ||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    count++;


                }


            }

        }
        System.out.print(count);

    }

}


