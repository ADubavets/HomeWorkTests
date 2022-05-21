import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    public static void main(String[] args) {
        // https://chromedriver.chromium.org/downloads - версии браузера
        System.setProperty("webdriver.chrome.driver","E:\\Java\\HomeWork\\HomeWorkTests\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3resource.com/java-exercises/");
        driver.manage().window().maximize();
    }
}
