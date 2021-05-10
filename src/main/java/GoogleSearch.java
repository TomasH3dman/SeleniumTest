import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main (String []args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://Downloads//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.actitime.com");

        WebElement element2 = driver.findElement(By.className("header__burger"));
        element2.click();
        Thread.sleep(1000);

        element2 = driver.findElement(By.className("header__button"));
        element2.click();
        Thread.sleep(1000);

        driver.manage().window().setSize(new Dimension(1900, 1020));

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Tomas");
        //Thread.sleep(1000);

        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Hedman");
        //Thread.sleep(1000);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("seleniumtest@selenium.test");
        //Thread.sleep(1000);

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("LTU");
        //Thread.sleep(1000);

    }
}
