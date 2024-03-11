package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_001ByID extends SeleniumBaseClass{
    @Test
    public void byID()
    {
        driver.get("https://www.google.co.in/");
        driver.findElement(By.id("APjFqb")).sendKeys("Automation Jobs", Keys.ENTER);

    }
}
