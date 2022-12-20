package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        //Biz browser'ları oluşturduğumuz driver sayesinde otomate edebiliyoruz.
        //Bunun için her testin başında mutlaka driver objesi oluşturacağız.

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        //Acılan sayfanın başlığının amazon içerdiğini test edin

        String expectedKelime= "amazon";
        String actualResult= driver.getTitle();
        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title amazon içermiyor test FAILED");
            System.out.println("Baslık: " + driver.getTitle());
        }

        //Gittiğimiz sayfanın url'sinin https://www.amazon.com/ olduğunu test edin
        String expectedUrl="https://www.amazon.com/";
        String actualUrl= driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url https://www.amazon.com/ test PASSED");
        }else {
            System.out.println("Test FAILED sayfanın URL'si: "+actualUrl);
        }


        Thread.sleep(5000);
        driver.close();


    }
}
