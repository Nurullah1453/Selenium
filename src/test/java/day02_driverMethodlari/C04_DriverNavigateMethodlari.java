package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        //Get ile aynı işlevi yapar.

        driver.get("https://www.wisequarter.com");

        //Yeniden amazona dönelim
        driver.navigate().back();

        //Tekrar wisequarter'a gidelim
        driver.navigate().forward();

        //Sayfayı Yenileyelim
        driver.navigate().refresh();








        Thread.sleep(3000);
        driver.quit();
    }
}
