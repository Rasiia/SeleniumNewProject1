package Project4;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test2 {
    @Test
    public void Test2() throws InterruptedException {
       /* Navigate to the "http://uitestpractice.com/Students/Index"
        Search any Lastname in search bar
        Click Edit button
        Change first name
        Click save button
        Search with new lastname Validate Firstname is changed*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().fullscreen();
        WebElement search= driver.findElement(By.xpath("//span[@class='input-group-btn']"));
        search.click();
        Thread.sleep(2000);
        WebElement lastname= driver.findElement(By.xpath("//input[@id='Search_Data']"));
        lastname.sendKeys("Daniiarova");
        WebElement click= driver.findElement(By.xpath("//input[@value='Find']"));
        click.click();
        WebElement edit= driver.findElement(By.xpath("//button[@class='btn']"));
        edit.click();
        WebElement changeName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        changeName.clear();
        changeName.sendKeys("Aizada");
        WebElement save= driver.findElement(By.xpath("//input[@class='btn btn-default']"));
        save.click();
        WebElement search2= driver.findElement(By.xpath("//span[@class='input-group-btn']"));
        search2.click();
        Thread.sleep(1000);
        WebElement sear= driver.findElement(By.xpath("//input[@value='Find']"));


        String  actualName = changeName.getText();
        String expectedName= "Aizada";
        Assert.assertEquals(actualName,expectedName);
    }
}
