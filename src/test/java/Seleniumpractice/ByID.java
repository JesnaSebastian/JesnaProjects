package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByID extends Baseclass {
    @Test

    public void findelementbyid()
    {
        driver.get("https://www.godigit.com/");
        driver.findElement(By.id("registration-search")).sendKeys("KA04DK8337", Keys.ENTER);
    }
}

