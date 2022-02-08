package lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZabbixPageObjectTest {
    WebDriver driver;
    private final static String ZABBIX_URL = "https://zabbix.com";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get(ZABBIX_URL);
    }

    @Test
    void fillCareerForm() {
        new StartPage(driver)
        .clickLanguageButton()
        .clickLanguageRuButton()
        .clickAboutUsButton()
        .clickCareerButton()
        .clickRigaButton()
        .clickRigaButton()
        .clickTestEngineer()
        .clickApplyNowButton()
        .fillParticipants()
        .fillEmail()
        .fillPhone()
        .fillComment()
        .checkPersonalData();
    }

    @AfterEach
    void killDriver() {
        driver.quit();
    }
}
