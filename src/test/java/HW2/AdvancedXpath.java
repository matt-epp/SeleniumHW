package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

        WebElement favouriteBook1 = driver.findElement(By.xpath("//input[@id='favourite-book']"));
        favouriteBook1.sendKeys("Harry Potter1");

        WebElement favouriteBook2 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        favouriteBook2.sendKeys("Harry Potter2");

        WebElement favouriteBook3 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        favouriteBook3.sendKeys("Harry Potter3");

        WebElement leastFavouriteBook1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavouriteBook1.sendKeys("Harry Potter3");

        WebElement leastFavouriteBook2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFavouriteBook2.sendKeys("Harry Potter2");

        WebElement leastFavouriteBook3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFavouriteBook3.sendKeys("Harry Potter1");

        WebElement grandparent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
       grandparent.sendKeys("Grandpa");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Dad");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Son");









    }
}
