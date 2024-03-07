package Day2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writeproperties {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "trip.text";



        FileOutputStream fis = new FileOutputStream(path);
        Properties props = new Properties();
        props.setProperty("City", "Bangalore");
        props.setProperty("Mobile", "8976543987");
        props.setProperty("Email", "jesna@gmail.com");
        props.store(fis, " ");


    }

}

