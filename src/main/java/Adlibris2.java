import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adlibris2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://Downloads//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://adlibris.com/se/");
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.id("q"));
        search.sendKeys("Kalle Anka");
        search.submit();
        Thread.sleep(2000);

        WebElement pick = driver.findElement(By.linkText("Kalle Anka : vem är vem i Ankeborg?"));
        pick.click();

        WebElement buy = driver.findElement(By.className("product__add-to-cart"));
        buy.click();
        Thread.sleep(2000);

        WebElement shop = driver.findElement(By.className("notifications-bar__added-to-cart__to-checkout"));
        shop.click();

    }
}
