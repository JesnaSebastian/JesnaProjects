package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ByXpath1 extends Baseclass {
    @Test
    public void locateusingxpath1() {
        driver.get("https://www.facebook.com/");
       // driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Autmation jobs", Keys.ENTER);
       // driver.findElement(By.xpath("//a[contains(text(), 'Forgotten password?')]")).click();
//different  way
      WebElement element= driver.findElement(By.xpath("//*[contains(text(), 'Forgotten password?')]"));
      element.click();

    }

}
