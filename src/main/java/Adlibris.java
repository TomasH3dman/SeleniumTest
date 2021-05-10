import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adlibris {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://Downloads//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://adlibris.com/se/");

        WebElement search = driver.findElement(By.id("q"));
        search.sendKeys("praktisk mjukvarutestning");
        search.submit();
        Thread.sleep(1000);

        WebElement pick = driver.findElement(By.className("search-result__product__name"));
        pick.click();

        WebElement buy = driver.findElement(By.className("product__add-to-cart"));
        buy.click();
        Thread.sleep(1000);

        WebElement shop = driver.findElement(By.className("notifications-bar__added-to-cart__to-checkout"));
        shop.click();
    }
}
