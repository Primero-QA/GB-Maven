package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZabbixTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://zabbix.com");
        driver.findElement(By.xpath("//a[@class='js_language']")).click();
        driver.findElement(By.xpath("//a[@data-lang='ru']")).click();
        driver.findElement(By.xpath("//span[.='О нас']")).click();
        driver.findElement(By.xpath("//span[.='Вакансии']")).click();
        driver.findElement(By.xpath("//a[.='Рига']")).click();
        driver.findElement(By.xpath("//a[.='Test Engineer']")).click();
        driver.findElement(By.xpath("//div[@class='span span-6']//a[.='Подать заявку']")).click();
        driver.findElement(By.name("participants")).sendKeys("Андрей Зазук");
        driver.findElement(By.name ("email")).sendKeys("andrey_z@inbox.lv");
        driver.findElement(By.name ("phone")).sendKeys("26454834");
        driver.findElement(By.name ("comment")).sendKeys("This is my job!");
        driver.findElement(By.name ("personal_data")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
