package Day2;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
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

    public static String firstname()
    {
        Faker faker=new Faker();
        return faker.name().firstName();
    }
    public static String fullName(){
        Faker faker = new Faker((new Locale("en-IND")));
        return faker.name().fullName();
    }
    public static String email(){
        Faker faker = new Faker((new Locale("en-IND")));
        return faker.name().firstName()+"@xyz.com";
    }
    public static String mobileNumber(){
        Faker faker = new Faker((new Locale("en-IND")));
        return faker.number().digits(10);
    }
    public static String address(){
        Faker faker = new Faker((new Locale("en-IND")));
        return faker.address().fullAddress();


    }
}

