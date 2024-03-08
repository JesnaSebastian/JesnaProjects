package LearningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001_LaunchingBrowser extends BaseClass {

    @Test
    public void getchrome()
    {
        driver.get("https://www.flipkart.com/");
        String name= driver.getTitle();
        System.out.println("Title of the page is "+name);
    }


}
