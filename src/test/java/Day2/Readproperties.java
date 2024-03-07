package Day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+ File.separator+"config.properties";

        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties(); //read the properties
        properties.load(fis);
        String x=properties.getProperty("browser");
        System.out.println(x);

    }
}
