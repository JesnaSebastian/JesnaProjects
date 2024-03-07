package Day1;

import java.io.File;
import java.io.IOException;

public class Createfille {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+ File.separator+"trip.txt";
        File file=new File(path);
        file.createNewFile();

    }
}
