package smruti;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public  class propertitestask {
    String[] propertiesT(String filename , String... key)throws Exception{
        String path=System.getProperty("user.dir");
        path=path+"\\src\\test\\java\\"+filename+".properties";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        Properties p = new Properties();
        p.load(fis);
        String[] s = new String[key.length];
        if (key.length>0){

            for (int i = 0 ; i<key.length;i++){
                s[i] = p.getProperty(key[i]);
            }
        }
        return s;
    }
    public static void main(String[] args)throws Exception{
        propertitestask pt = new propertitestask();
        String[] a = pt.propertiesT("pr1","name","hobby","dob");
        for (String c :a){
            System.out.println(c);
        }
    }
}

/* write a return type  method to retrive  the  value from  any propertises file  (we should use variable parameters
    multiple keys can be passed so that it can retrieve all the  values  from mentioned  propertises file )*/

