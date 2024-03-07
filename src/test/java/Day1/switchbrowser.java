package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchbrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        String browser = "chrome";
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                System.out.println("chrome browser launched");
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new ChromeDriver();
                System.out.println("firefox browser launched");
                break;

        }
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.close();
    }

}