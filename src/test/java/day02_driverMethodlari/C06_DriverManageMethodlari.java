package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //implicitlyWait gittiğimiz sayfa açılıncaya veya aradıgımız webelement bulununcaya kadar
        //Driver'ın bekleyebileceği max süreyi belirler.

        //Yukarıdaki 4 lü her test methodumuzun başına yazılacak.




        Thread.sleep(3000);
        driver.close();
    }
}
