import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@Test
public class SuccessfullLoginTest {
    WebDriver driver= new ChromeDriver();   


    @BeforeTest
    public void beforeTest() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        assert driver.getTitle().equals("Swag Labs");

    }
    @Test
    public void LoginSuccessful() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        String pathvar = "//*[@id=\"password\"]";
        driver.findElement(By.xpath(pathvar)).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        assert driver.findElement(By.cssSelector(".inventory_item_label>a")).isDisplayed();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    

}