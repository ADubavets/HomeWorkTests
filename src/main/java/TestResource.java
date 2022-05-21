
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestResource {
    public static WebDriver driver;

    @BeforeAll
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "E:\\Java\\HomeWork\\HomeWorkTests\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3resource.com/java-exercises/");
    }

    @Test
    @Order(1)
    public void verifyTitle() {
        driver.get("https://www.w3resource.com/java-exercises/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String ActualTitle = driver.getTitle();
        System.out.println("Actual Title :" + ActualTitle);
        String ExpectedTitle = "Java programming Exercises, Practice, Solution - w3resource";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Title passed");
    }

    @Test
    @Order(2)
    public void test1() {
        // $x("//div/div[1]/ul/li[8]/a")[0].innerText
        // /html/body/div[2]/div/main/div/div/div[1]/ul/li[8]/a
            WebElement input =
                    driver.findElement(By.xpath("//div/div[1]/ul/li[8]/a[@href='/java-exercises/array/index.php']"));
            input.click();
            Rectangle res =  driver.findElement(By.cssSelector("h1")).getRect();
            System.out.println(res.getX());
            String text = driver.findElement(By.cssSelector("h1")).getText();
            System.out.println(text);
            System.out.println("Array passed");
            driver.navigate().back();
    }

    @Test
    @Order(3)
    public void test2() {
        //$x("//div/div[1]/ul/li[9]/a")[0].innerText
        // /div/main/div/div/div[1]/ul/li[9]/a
        //https://www.w3resource.com/java-exercises/string/index.php
        WebElement input =
                driver.findElement(By.xpath("//div/div[1]/ul/li[9]/a[@href='/java-exercises/string/index.php']"));
        input.click();
        System.out.println("String passed");
        driver.navigate().back();
    }

    @Test
    @Order(4)
    public void test3() {
        WebElement input =
                driver.findElement(By.xpath("//div/div[1]/ul/li[14]/a[@href='/java-exercises/collection/index.php']"));
        input.click();
        System.out.println("Collection passed");
    }

    @AfterTest
    public void closeDriver() {

        //closes the browser
        driver.close();

    }

}
