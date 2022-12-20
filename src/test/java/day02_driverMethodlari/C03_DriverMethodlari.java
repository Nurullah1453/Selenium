package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");
        //System.out.println(driver.getPageSource());

        //PageSource'nin MEOW içerdiğini test edin

        String pageSource= driver.getPageSource();
        String expectedKelime="MEOW";
        if (pageSource.contains(expectedKelime)){
            System.out.println("PageSource testi PASTE");
        }else {
            System.out.println("PageSource testi FAILED"+" MEOW kelimesi bulunamadı.");
        }




        driver.close();
    }
}
