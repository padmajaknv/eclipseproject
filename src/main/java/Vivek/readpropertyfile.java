package Vivek;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readpropertyfile {
    String[] readpropfile(String x, String... y) throws Exception {
        String fp = System.getProperty("user.dir");
        fp = fp+"//src//main//java//vivek//"+x+".properties";
        File file = new File(fp);
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        String[] z=new String[y.length];
        if(y.length>0) {
            for (int j = 0; j < y.length; j++) {
                z[j] = prop.getProperty(y[j]);
            }

        }
        return z;
    }

    public static void main(String[] args) throws Exception  {
        readpropertyfile m = new readpropertyfile();

        String[] output = m.readpropfile("sample", "name", "password", "gender", "dob");
        for(String value:output){
            System.out.println(value);
        }


    }
}

