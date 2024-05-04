import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement firstname = driver.findElement(By.name("first_name"));
        firstname.sendKeys("Matt");
        WebElement lastname = driver.findElement(By.name("last_name"));
        lastname.sendKeys("Eppenauer");
        WebElement mail = driver.findElement(By.name("email"));
        mail.sendKeys("matt.b.epp@gmail.com");
        WebElement submit = driver.findElement(By.id("submit_button"));
        submit.click();
        WebElement clickhere = driver.findElement(By.linkText("Click Here."));
        clickhere.click();
        WebElement links = driver.findElement(By.linkText("Link"));
        links.click();

    }
}
