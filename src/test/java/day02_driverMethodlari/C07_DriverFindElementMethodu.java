package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverFindElementMethodu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com"); //Amazona gider

        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox")); //id ile tarif ettik
        //bu id ye sahip locater'a gider ve bunu aramaKutusu adında webElemente atadık

        aramaKutusu.sendKeys("Nutella"); //Arama kutusuna nutella yazar
        aramaKutusu.submit(); //enter'a basar.








        Thread.sleep(3000); //3 saniye bekler
        driver.close(); //Sayfayı kapatır.
    }
}
