import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Login
{
    WebDriver driver;

    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement x= driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")); //
        x.sendKeys("samsung" + Keys.ENTER);
    }

    @Test (priority = 2, dependsOnMethods = "Go_to")
    public void compare() throws InterruptedException {
        try
        {
            WebElement checkbox1= driver.findElement(By.xpath("//label[@class='tJjCVx jJqq1Y']//div[@class='XqNaEv']"));
            checkbox1.click();
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong.");
        }
        Thread.sleep(5000);
        Set<String> handle = driver.getWindowHandles();
        Iterator it1 =handle.iterator();
        String parentID = (String)it1.next();
        String childID = (String)it1.next();
        driver.switchTo().window(parentID);

        Actions action = new Actions(driver);action.moveToElement(driver.findElement(By.xpath("//div[@class='cPHDOP col-12-12']//div[2]//div[2]//div[1]//span[1]//label[1]//div[1]"))).click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.moveToElement(driver.findElement(By.xpath("(//div[@class = 'XqNaEv'])[2]"))).click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[@class='RCafFg -3yGLs']")).click();
    }

    @Test (priority = 0)
    public void Go_to()
    {
        //To scroll the page
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@class='KzDlHZ'][normalize-space()='SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)']"))).click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Set<String> handle = driver.getWindowHandles();

        Iterator it1 =handle.iterator();
        String parentID = (String)it1.next();
        String childID = (String)it1.next();
        driver.switchTo().window(childID);
        driver.findElement(By.xpath("//button[normalize-space()='Buy Now']")).click();
    }

    @Test (priority = 1)
    public void login() throws InterruptedException
    {
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7598243388");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        //WebElement change =  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Change?']")));
        //change.click();
    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }
 }


