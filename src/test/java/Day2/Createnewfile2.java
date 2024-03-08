package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Createnewfile2 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + File.separator + "config1.properties";
        File file = new File(path);
        Properties properties = new Properties();
        try {
            file.createNewFile();
            FileOutputStream fos=new FileOutputStream(path);
            properties.setProperty("Browser", "firefox");
            properties.setProperty("URL", "http://www.flipkart.com");
            properties.setProperty("Products", "Laptop");
            properties.setProperty("Name", "Sudha");
            properties.setProperty("City", "Bangalore");
            properties.store(fos, "");

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}