package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_003Linktext extends SeleniumBaseClass{
    @Test
    public void byID()  {
        driver.get("https://www.google.co.in/");
       // driver.findElement(By.partialLinkText("हिन्")).click();

       driver.findElement(By.name("q")).sendKeys("Flipkart", Keys.ENTER);


    }
}
