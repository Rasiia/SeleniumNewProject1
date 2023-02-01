package Project4;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;
@Test
public class Test1 {
    public static void Test1() throws InterruptedException {
       /* Navigate to the "http://uitestpractice.com/Students/Index" Click Create new button
        Enter any firstname, lastname and enrollment date
        Click create button
        Search firstname in search bar Validate the new information is created*/

      /*  WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement button = driver.findElement(By.xpath("//input[@id='Search_Data']"));
        button.click();
        WebElement create = driver.findElement(By.linkText("Create New"));
        create.click();
        Thread.sleep(4000);
        WebElement firsttname= driver.findElement(By.xpath("//input[@id='FirstName']"));
        firsttname.sendKeys("Rasiia");
        Thread.sleep(4000);
        WebElement lasttname= driver.findElement(By.xpath("//input[@id='LastName']"));
        lasttname.sendKeys("Daniiarova");
        Thread.sleep(4000);
        WebElement id = driver.findElement(By.xpath("//input[@id='EnrollmentDate']"));
        id.sendKeys("02/24/2022");
        WebElement createe = driver.findElement(By.xpath("//input[@value='Create']"));
        createe.click();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        opt.addArguments("disable-infobars");
        WebDriver driver1=new ChromeDriver(opt);

        driver1.get("http://uitestpractice.com/Students/Index");
        WebElement createNew=driver1.findElement(By.xpath("//a[.='Create New']"));

        driver1.navigate().to(createNew.getAttribute("href"));
        WebElement firsttname= driver1.findElement(By.xpath("//input[@id='FirstName']"));
        firsttname.sendKeys("Rasiia");
        Thread.sleep(4000);
        WebElement lasttname= driver1.findElement(By.xpath("//input[@id='LastName']"));
        lasttname.sendKeys("Daniiarova");
        Thread.sleep(4000);
        WebElement id = driver1.findElement(By.xpath("//input[@id='EnrollmentDate']"));
        id.sendKeys("02/24/2022");
        WebElement createe = driver1.findElement(By.xpath("//input[@value='Create']"));
        createe.click();

       // String actualmessage = BrowsUtils.getText(message);
       // String  expectedmessege ="";
       // Assert assert true(actualmessa,gexpectedmessege);
    }
}