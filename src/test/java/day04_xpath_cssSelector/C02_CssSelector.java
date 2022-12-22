package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*

        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        11-Sayfayi kapatin

         */
        //İstenen adrese gidelim
        driver.get("https://www.amazon.com/");

        //Sayfayı Yenileyelim
        driver.navigate().refresh();

        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedMetin="Spend less";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedMetin)){
            System.out.println("Sayfa Başlıgı Testi PASSED");
        }else {
            System.out.println("Sayfa Başlıgı Testi FAILED");
        }

        //Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(2000);

        //Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();

        //Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]")).click();

        //Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        //Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcretElementi= driver.findElement(By.xpath("(//span[text()='$25.00'])[1]"));

        String expectedUcret="$25.00";
        String actualUcretYazısı=urunUcretElementi.getText();
        if (expectedUcret.equals(actualUcretYazısı)){
            System.out.println("Ürün ücret elementi testi PASSED");
        }else{
            System.out.println("Ürün ücret elementi testi FAILED");
        }

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
