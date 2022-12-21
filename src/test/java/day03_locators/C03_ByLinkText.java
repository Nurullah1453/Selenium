package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
     //amazon ana sayfaya gidip gift cart linkine tıklayın gift cards sayfasına
        //gittiğini test edin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement giftCardLinki= driver.findElement(By.linkText("Gift Cards"));
        giftCardLinki.click();

        //istenen sayfaya gittiğini test etmek için
        //title'nin gift card'ına içerdiğini test edebiliriz.

        String expectedKelime="Gift Cards";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.printf("Test PASSED");
        }else {
            System.out.printf("Test FAILED");
        }











        Thread.sleep(3000);
        driver.close();
    }
}
