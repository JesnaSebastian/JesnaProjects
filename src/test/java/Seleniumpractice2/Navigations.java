package Seleniumpractice2;

import Seleniumpractice.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Navigations extends Baseclass {
    @Test

    public void methods() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.flipkart.com/");
        String Pagatitle=driver.getTitle();
        System.out.println(Pagatitle);
        //driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Dress", Keys.ENTER);
        //driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
    }


}
