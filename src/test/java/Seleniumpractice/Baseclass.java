package Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
    protected WebDriver driver;
    @BeforeClass

    public void initialise()
    {

        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
