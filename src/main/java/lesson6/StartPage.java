package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='js_language']")
    private WebElement languageButton;

    public StartPage clickLanguageButton() {
        languageButton.click();
        return this;
    }

    @FindBy(xpath = "//a[@data-lang='ru']")
    private WebElement languageRuButton;

    public RuPage clickLanguageRuButton() {
        languageRuButton.click();
        return new RuPage(driver);
    }
}
