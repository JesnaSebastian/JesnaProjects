package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_002 extends BaseClass{
@Test
    public void test()
    {
        driver.get("https://www.amazon.com");
        String pagetitle= driver.getTitle();
        System.out.println("Page Title is "+pagetitle);

    }

}
