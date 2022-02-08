package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends BasePage {

    public CareerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Рига']")
    private WebElement riga;

    public CareerPage clickRigaButton() {
        riga.click();
        return this;
    }

    @FindBy(xpath = "//a[.='Test Engineer']")
    private WebElement testEngineer;

    public TestEngineerPage clickTestEngineer() {
        testEngineer.click();
        return new TestEngineerPage(driver);
    }
}
