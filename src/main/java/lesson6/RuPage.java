package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RuPage extends BasePage {

    public RuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='О нас']")
    private WebElement aboutUs;

    public RuPage clickAboutUsButton() {
        aboutUs.click();
        return this;
    }

    @FindBy(xpath = "//span[.='Вакансии']")
    private WebElement career;

    public CareerPage clickCareerButton() {
        career.click();
        return new CareerPage(driver);
    }
}
