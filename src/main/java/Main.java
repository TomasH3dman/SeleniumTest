import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {
    public static void main(String [] args){
        //chrome browser ----> chrome driver
        System.setProperty("webdriver.chrome.driver", "D://Downloads//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //SearchContext driver1 = new ChromeDriver();
        //RemoteWebDriver driver3 = new ChromeDriver();

        //navigate to URL
        driver.get("https://www.google.com");

        //close the browser
        driver.close();


    }

}
