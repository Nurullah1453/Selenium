package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);

        driver.close();

        /*
        1- Seleium jar dosyalarını ve chromedriver'ını manuel olarak sisteme tanıtmıs olduk

        Eğer firefox veya safari ile çalışmamız gerekse bu defa da onların driverlerını indirim
        manuel olarak 10.satırda o driverları tanımlamalıyız.

        2- 12. satırda bir chrome driver constructer'ını kullanarak bir obje oluşturduk.
        Bu objeyi kullanmasak bile bu satırdan dolayı boş ver browser açılır.

        3- driver.get(url) driver'ı yazdıgımız url'e götürür.
        url yazarken www yazmasak çalısır ancak
        https:// yazmassak method çalışmaz.
         */

    }
}
