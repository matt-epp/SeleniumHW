package HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Calendar {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        driver.findElement(By.xpath("//b[text()='Leave']")).click();
        // driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        WebElement fromDate = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        fromDate.click();
        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(monthDD);
        sel.selectByValue("3");
        WebElement yearDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel2 = new Select(yearDD);
        sel2.selectByValue("2026");
        List<WebElement> daysOfMonth = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement days : daysOfMonth) {
            if (days.getText().equals("15")) {
                days.click();
                break;
            }

        }


    }
}

