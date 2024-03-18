package Practicefilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateFileAndInputData {
    public static void main(String[] args) throws IOException {
        String Path=System.getProperty("user.dir")+ File.separator+"PracData.properties";
        File file=new File(Path);
        file.createNewFile();

        FileOutputStream fis=new FileOutputStream(Path);
        Properties prop=new Properties();
        prop.setProperty("Browser", "Chrome");
        prop.setProperty("City", "Bangalore");
        prop.setProperty("Name", "Jesna");
        prop.store(fis, " ");


    }
}
