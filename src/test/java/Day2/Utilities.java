package Day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// creating a reusable code
public class Utilities {

    public static String getValue(String Key)  {
        String path = System.getProperty("user.dir") + File.separator + "config.properties";
        String x=null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fis);
            x=properties.getProperty(Key);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return x;

    }
}

