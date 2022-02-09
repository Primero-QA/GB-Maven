package lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends BasePage {

    public CareerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Рига']")
    private WebElement riga;

    @Step ("Switch to career page")
    public CareerPage clickRigaButton() {
        riga.click();
        return this;
    }

    @FindBy(xpath = "//a[.='Test Engineer']")
    private WebElement testEngineer;

    @Step ("Select Test Engineer")
    public TestEngineerPage clickTestEngineer() {
        testEngineer.click();
        return new TestEngineerPage(driver);
    }
}
