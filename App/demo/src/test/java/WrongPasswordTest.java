
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



public class WrongPasswordTest {
    WebDriver driver= new ChromeDriver();   
    @BeforeTest
    public void beforeTest() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        assert driver.getTitle().equals("Swag Labs");
    }
    @Test
    public void LoginWrongPassword() {
        String pathvar = "//*[@id=\"user-name\"]";
        driver.findElement(By.xpath(pathvar)).sendKeys("standard_user");
        
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.className("submit-button")).click();
       
        assert driver.findElement(By.cssSelector(".error-message-container.error")).isDisplayed();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
