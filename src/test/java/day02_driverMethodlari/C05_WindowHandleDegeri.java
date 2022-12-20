package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedrivers_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        System.out.println("Window Handle: "+driver.getWindowHandle()); //UNIQUE window handle degeri

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wisequarter.com");
        System.out.println("Window Handle: "+driver.getWindowHandle());








        Thread.sleep(3000);
        driver.quit();
    }
}
