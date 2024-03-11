package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Countoflinks extends SeleniumBaseClass {
    @Test
    public void CountLink() {
        driver.get("https://www.google.co.in");

        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links : " + Links.size());
        for (WebElement Link : Links) {
            System.out.println(Link.getText() + "--->" + Link.getAttribute("href"));
        }
    }
}
