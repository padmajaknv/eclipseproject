package JavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readAPropFile {

    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir");
        filePath = filePath+"\\src\\test\\java\\sample.properties";

        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        Properties pro = new Properties();
        pro.load(fis);
        String gender = pro.getProperty("gender");
        String dob = pro.getProperty("dob");
        System.out.println(gender);
        System.out.println(dob);
    }

}


