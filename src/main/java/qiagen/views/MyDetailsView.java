package qiagen.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qiagen.locators.MyDetailsLocators;

import java.util.ArrayList;
import java.util.List;


public class MyDetailsView {

    private MyDetailsLocators myDetailsLocators;

    public MyDetailsView(WebDriver driver) {
        myDetailsLocators = new MyDetailsLocators(driver);

    }

    public void setEmail(String email) {
        myDetailsLocators.emailField().clear();
        myDetailsLocators.emailField().sendKeys(email);
    }

    public void setPassword(String password) {
        myDetailsLocators.passwordField().clear();
        myDetailsLocators.passwordField().sendKeys(password);
    }

    public List<String> getAvailableLocations() {
        List<String> locations = new ArrayList<>();
        for (WebElement element : myDetailsLocators.locationSelect().getOptions()) {
            locations.add(element.getText());
        }

        return locations;
    }

    public void setLocation(String location) {
        myDetailsLocators.locationSelect().selectByVisibleText(location);
    }

    public void clickNextButton() {
        myDetailsLocators.nextButton().click();
    }

    public void setTelephone(String phoneNumber) {
        if (phoneNumber != null) {
            myDetailsLocators.telephoneField().clear();
            myDetailsLocators.telephoneField().sendKeys(phoneNumber);
        }
    }

    public void setTitle(String title) {
        myDetailsLocators.tittleSelector().selectByVisibleText(title);
    }

    public void setAcademicTitle(String academicTitle) {
        myDetailsLocators.academicTittleSelector().selectByVisibleText(academicTitle);
    }

    public void setLastName(String lastName) {
        myDetailsLocators.lastNameField().clear();
        myDetailsLocators.lastNameField().sendKeys(lastName);
    }

    public void setFirstName(String firstName) {
        myDetailsLocators.firstNameField().clear();
        myDetailsLocators.firstNameField().sendKeys(firstName);
    }
}
