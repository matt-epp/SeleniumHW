import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW
goto facebook .com
click on create new account and fill in all the text box only
 */
public class HW1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Matt");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Jones");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("matt.jones@yahoo.com");
        WebElement passWord = driver.findElement(By.name("reg_passwd__"));
        passWord.sendKeys("12345678");

        WebElement dropDownMenu = driver.findElement(By.name("birthday_year"));
        Select s = new Select(dropDownMenu);
        s.selectByValue("1990");

        WebElement selection = driver.findElement(By.className("_58mt"));
        selection.click();
        WebElement button = driver.findElement(By.name("websubmit"));
        button.click();





    }
}
