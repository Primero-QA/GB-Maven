package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestEngineerPage extends BasePage {

    public TestEngineerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='span span-6']//a[.='Подать заявку']")
    private WebElement applyNow;

    public ApplicationFormPage clickApplyNowButton() {
        applyNow.click();
        return new ApplicationFormPage(driver);
    }
}
