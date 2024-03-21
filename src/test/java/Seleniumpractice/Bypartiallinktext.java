package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Bypartiallinktext extends Baseclass {
    @Test
    public void Bypartiallinktext() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.partialLinkText("తెలు")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("APjFqb")).sendKeys("News", Keys.ENTER);
    }
}
