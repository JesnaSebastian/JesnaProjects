package LearningTestNG;

import org.testng.annotations.Test;

public class TC_003 extends BaseClass{
@Test
    public void test()
    {
        driver.get("https://www.makemytrip.com");
        String pagetitle= driver.getTitle();
        System.out.println("Page Title is "+pagetitle);

    }

}
