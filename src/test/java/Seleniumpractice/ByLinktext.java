package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByLinktext extends Baseclass{
    @Test
    public void Searchbylinktext() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("తెలుగు")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("APjFqb")).sendKeys("News", Keys.ENTER);
    }
}
