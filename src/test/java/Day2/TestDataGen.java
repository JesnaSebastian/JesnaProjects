package Day2;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataGen {
    public static void main(String[] args) {
        Faker faker=new Faker(); //objct of faker class
        //printing names from the faker library
        String fn=faker.name().fullName();
        System.out.println(fn);

        //printing Indian names from the faker library
        Faker fake= new Faker((new Locale("en_IND")));
        String Indian_name =fake.name().fullName();
        System.out.println("Indian name is:" + Indian_name);
        System.out.println("clled from reusable methofd Utilities "+Utilities.firstname());
        System.out.println("clled from reusable methofd Utilities "+Utilities.address());
        System.out.println("clled from reusable methofd Utilities "+Utilities.mobileNumber());
    }
// like this we can print first name, last name and so on


}
