package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationFormPage extends BasePage{

    public ApplicationFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "participants")
    private WebElement participants;

    public ApplicationFormPage fillParticipants() {
        participants.sendKeys("Андрей Зазук");
        return this;
    }

    @FindBy(name = "email")
    private WebElement email;

    public ApplicationFormPage fillEmail() {
        email.sendKeys("andrey_z@inbox.lv");
        return this;
    }

    @FindBy(name = "phone")
    private WebElement phone;

    public ApplicationFormPage fillPhone() {
        phone.sendKeys("26454834");
        return this;
    }

    @FindBy(name = "comment")
    private WebElement comment;

    public ApplicationFormPage fillComment() {
        comment.sendKeys("This is my job!");
        return this;
    }

    @FindBy(name = "personal_data")
    private WebElement personalData;

    public ApplicationFormPage checkPersonalData() {
        personalData.click();
        return this;
    }
}
