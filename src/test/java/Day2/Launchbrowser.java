package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {
    public static void main(String[] args) {
        String browser = Utilities.getValue("browser");
        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new FirefoxDriver();
        }
        driver.get(Utilities.getValue("Link"));
    }
}
