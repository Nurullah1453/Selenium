package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {
        //Amazon'a gidip nutella için arama yapın, ilk sayfada çıkan ürünlerin içerisinde en yüksek
        //fiyatı bulalım.
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi =driver.findElements(By.className("a-price-whole"));


        // System.out.println(fiyatlarListesi); Web element bir obje oldugundan direkt yazdırılamaz

        //Bunun için for-each loop kullanarak herbir webelementi tek tek yazdırmalıyız.

        for (WebElement each:fiyatlarListesi
             ) {
            System.out.print(each.getText()+" ");
        }

        //En yüksek fiyatı bulabilmek için java bilgimizi kullanmalıyız.
        //1-Web elementlerden getText ile fiyatı String olarak alın
        //2-Kıyaslama yapabilmek için fiyatı int'e çevirin
        //3-En yüksek fiyatı bulup yazdırın.

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;

        for (WebElement each:fiyatlarListesi
        ) {
            fiyatStr=each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);

            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }
        }

        System.out.printf("");
        System.out.println("En yüksek fiyat: "+ enYuksekFiyat);


        Thread.sleep(3000);
        driver.close();





    }
}
