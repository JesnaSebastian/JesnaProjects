package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SeleniumBaseClass {
    protected WebDriver driver;
    @BeforeClass
    public void Base1() throws InterruptedException {
        driver= new ChromeDriver();

        driver.manage().window().maximize();
    }
    @AfterClass
    public  void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
