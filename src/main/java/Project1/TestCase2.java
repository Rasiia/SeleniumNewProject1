package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {


    @Test
    public void validateHeader() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        WebElement passport = driver.findElement(By.xpath("//input[@type='password']"));
        passport.sendKeys("test");

        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();
        WebElement button = driver.findElement(By.xpath("//a[.='View all products']"));
        button.click();

        driver.manage().window().maximize();
        String actualTitle="View all products";
        String expectedTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"title is not matching");



    }
}