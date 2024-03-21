package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Numberoflinks extends Baseclass{
    @Test
    public void Findcountoflinksusingtagname()
    {
        driver.get("https://www.google.com/");
        List<WebElement> Links=driver.findElements(By.tagName("a"));
        System.out.println("Total count is "+Links.size());
        for(WebElement Link: Links){
            System.out.println(Link.getText()+"--->"+Link.getAttribute("href"));
        }
    }

}
