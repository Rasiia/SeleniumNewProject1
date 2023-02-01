package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
    @Test
    public void validateHeader() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");

        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        WebElement passport = driver.findElement(By.xpath("//input[@type='password']"));
        passport.sendKeys("test");

        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();

        driver.manage().window().maximize();

        WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
        order.click();


        WebElement qant = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        qant.sendKeys("3");


        WebElement customername = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customername.sendKeys("Rasiia");

        WebElement street = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        street.sendKeys("Brooklyn");

        WebElement city = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        city.sendKeys("New York");

        WebElement state = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        state.sendKeys("Marryland");
         WebElement zip = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
         zip.sendKeys("11224");

         WebElement visa = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
         visa.click();

         WebElement card = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
         card.sendKeys("12345");

         WebElement exs =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
         exs.sendKeys("12/12/2022");

         WebElement proses = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
         proses.click();


    }
}
