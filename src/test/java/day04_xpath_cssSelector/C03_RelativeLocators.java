package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        /*
        1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        2 ) Berlin’i 3 farkli relative locator ile locate edin
        3 ) Relative locator’larin dogru calistigini test edin
         */
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        //Sailor'un üzerindeki diyelim
        WebElement saliorElementi= driver.findElement(By.xpath("//p[text()='Sailor']"));
        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).above(saliorElementi));
        //Bostan'ın sağı diyelim
        WebElement bostanElementi= driver.findElement(By.xpath("//p[text()='Boston']"));
        WebElement berlin2= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostanElementi));

        //NYC'nin altındaki diyelim
        WebElement nycElementi= driver.findElement(By.xpath("//p[text()='NYC']"));
        WebElement berlin3= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycElementi));

        //Eğer bir tane elementten tarif ettiğimizde yine bulamazsak birden fazla elementle
        //tarif edebilirz.

        WebElement berlin4= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostanElementi).above(saliorElementi));


        //3 ) Relative locator’larin dogru calistigini test edin

        //id sinin pid7_thumb oldugunu test edelim
        String expectedIdDegeri="pid7_thumb";
        String actualIdDegeri=berlin4.getAttribute("Id");

        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("Relative Locator Testi PASSED");
        }else {
            System.out.println("Relative Locator Testi FAILED");
        }


        driver.close();
    }
}
