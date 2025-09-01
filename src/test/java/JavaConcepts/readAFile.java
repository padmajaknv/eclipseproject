package JavaConcepts;

import java.io.File;
import java.util.Scanner;

public class readAFile {
    public static void main(String[] args) throws Exception{
        String filePath = System.getProperty("user.dir"); //retrieves the path to the project
        System.out.println(filePath);
        filePath = filePath+ "\\src\\test\\java\\sample.txt";
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        StringBuffer sbf = new StringBuffer("");
        while(sc.hasNext()){
//            System.out.println(sc.next());
            sbf = sbf.append(sc.next()+" ");
        }
        System.out.println(sbf);
    }
}
