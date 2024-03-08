package Day2;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Createnewfile1 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + File.separator + "List1.txt";
        File file = new File(path);
        Properties props = new Properties();
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(path);
            props.setProperty("Browser", "firefox");
            props.setProperty("URL", "http://www.flipkart.com");
            props.setProperty("Products", "Laptop");
            props.setProperty("Name", "Sudha");
            props.setProperty("City", "Bangalore");
            props.store(fos, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(path);
            String Name= props.getProperty("Name");
            String City= props.getProperty("City");
            String Prod= props.getProperty("Products");
            String Brow= props.getProperty("Browser");
            String url = props.getProperty("URL");
            System.out.println("Name = "+Name);
            System.out.println("City ="+City);
            System.out.println("Products ="+Prod);
            System.out.println("Browser ="+Brow);
            System.out.println("URL ="+url);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}