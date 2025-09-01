package Bhanukrishna07;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyfile {
    //String[] readpropertyfile(String filename, String... keys) throws Exception {

    static String[] propertyfile(String filename, String... keys) throws Exception {
        String path = System.getProperty("user.dir") + "\\src\\main\\java\\Bhanukrishna07\\" + filename + ".properties";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fis);

        String[] values = new String[keys.length];
        for (int i = 0; i < keys.length; i++) {
            values[i] = prop.getProperty(keys[i]);
            System.out.println(keys[i] + " = " + values[i]);  //  Print key-value pair
        }

        return values;
    }

    public static void main(String[] args) throws Exception {
        //ReadPropertyfile rd = new ReadPropertyfile();
        //String[] values = rd.propertyfile("propertyfile", "course", "batch", "name", "location");

        //Method declare with static keyword
        String [] values=ReadPropertyfile.propertyfile("Sample","course","batch","name","location");
    }
}



