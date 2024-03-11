package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_004 extends BaseClass{
@Test
    public void test()
    {
        driver.get("https://www.goibibo.com");
        String pagetitle= driver.getTitle();
        System.out.println("Page Title is "+pagetitle);
        Reporter.log("Page Title" +pagetitle);
        Reporter.log(driver.getCurrentUrl());

    }

}
