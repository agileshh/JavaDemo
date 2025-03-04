import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;

public class Screenshot
{
    WebDriver driver;

    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/13832322/how-to-capture-the-screenshot-of-a-specific-element-rather-than-entire-page-usin");
        driver.manage().window().maximize();
    }
    @Test
    public void login()
    {
        //driver.findElement(By.xpath("//input[@placeholder='Search…']")).click();
        //driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("7598243388");
        //driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();

        TakesScreenshot TS = (TakesScreenshot) driver;
        File sourcefile= TS.getScreenshotAs(OutputType.FILE);
        File Targetfile = new File("C:\\Users\\arusi\\Videos\\Screen Recordings\\pk1.png");
        sourcefile.renameTo(Targetfile);

        WebElement Askquestion = driver.findElement(By.xpath("//div[@id='sidebar']//li[4]//div[2]"));
        File sf=Askquestion.getScreenshotAs(OutputType.FILE);
        File tf = new File("C:\\Users\\arusi\\Videos\\Screen Recordings\\pk2.png");
        sf.renameTo(tf);

        WebElement Askquestion = driver.findElement(By.xpath("//div[@id='sidebar']//li[4]//div[2]"));
        File sf = new File("ask question");
        driver.






;




    }
}

