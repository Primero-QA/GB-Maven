package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class ZabbixTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String ZABBIX_URL = "https://zabbix.com";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(ZABBIX_URL);
    }

    @Test
   public void hoverMenuTest() throws InterruptedException {
        actions.moveToElement(driver.findElement(By.xpath("//span[.='About Us']")))
                .click()
                .moveToElement(driver.findElement(By.xpath("//span[.='Career']")))
                .click()
                .build()
                .perform();
        Assertions.assertTrue(driver.getCurrentUrl().contains("career"));
        actions.moveToElement(driver.findElement(By.xpath("//a[.='Test Engineer']")))
                .click().build().perform();
        Assertions.assertTrue(driver.getCurrentUrl().contains("test_engineer"));
    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }
}