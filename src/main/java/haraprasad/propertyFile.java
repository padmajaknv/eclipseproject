package haraprasad;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propertyFile {
    String[] get(String file,String... key)throws Exception{
        String filePath = System.getProperty("user.dir");
        filePath = filePath+"//src//main//java//haraprasad//"+file+".properties";
        File file1 = new File(filePath);
        FileInputStream fis = new FileInputStream(file1);
        Properties pro = new Properties();
        pro.load(fis);
        String[] a=new String[key.length];
        if(key.length>0){

            for(int j=0;j<key.length;j++){
                    a[j]=pro.getProperty(key[j]);
            }
        }
        return a;
    }

    public static void main(String[] args) throws Exception{
        propertyFile data=new propertyFile();
        String[] d=data.get("sample","name","pass","gender");
//        System.out.println(d);
        for(String value:d){
            System.out.println(value);
        }
    }
}
