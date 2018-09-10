package qiagen.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoneLocators {
    private static final By registrationConfirmation = new By.ByXPath("(//*[contains(.,\"You are registered for My QIAGEN\")])[last()]");
    private static final By resendActivationEmailButton = new By.ByXPath("//button[contains(.,\"Resend activation email\")]");
    private WebDriver driver;

    public DoneLocators(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement registrationConfirmation() {
        return driver.findElement(registrationConfirmation);
    }

    public WebElement resendActivationEmailButton() {
        return driver.findElement(resendActivationEmailButton);
    }


}
