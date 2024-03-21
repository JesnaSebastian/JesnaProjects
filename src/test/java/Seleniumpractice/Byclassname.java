package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Byclassname extends Baseclass {
    @Test
    public void Locateusingclassname() {
        driver.get("https://www.godigit.com/");
        driver.findElement(By.name("mobile-number")).sendKeys("9087654786", Keys.ENTER);
    }
}