package qiagen.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyDetailsLocators {
    private static final By emailField = new By.ByXPath("//input[@type=\"email\"]");
    private static final By passwordField = new By.ByXPath("//input[@type=\"password\"]");
    private static final By telephoneField = new By.ByXPath("//input[@formcontrolname=\"telephoneNumber\"]");
    private static final By firstNameField = new By.ByXPath("//input[@formcontrolname=\"firstName\"]");
    private static final By lastNameField = new By.ByXPath("//input[@formcontrolname=\"lastName\"]");
    private static final By locationSelector = new By.ByXPath("//select[@name=\"country\"]");
    private static final By tittleSelector = new By.ByXPath("//label[contains(., 'Title')]/select");
    private static final By academicTittleSelector = new By.ByXPath("//label[contains(., 'Academic title')]/select");
    private static final By nextButton = new By.ByXPath("//button[@type=\"submit\"]");

    private WebDriver driver;

    public MyDetailsLocators(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailField() {
        return driver.findElement(emailField);
    }

    public WebElement passwordField() {
        return driver.findElement(passwordField);
    }

    public WebElement telephoneField() {
        return driver.findElement(telephoneField);
    }

    public WebElement firstNameField() {
        return driver.findElement(firstNameField);
    }

    public WebElement lastNameField() {
        return driver.findElement(lastNameField);
    }

    public Select locationSelect() {
        return new Select(driver.findElement(locationSelector));
    }

    public Select tittleSelector() {
        return new Select(driver.findElement(tittleSelector));
    }

    public Select academicTittleSelector() {
        return new Select(driver.findElement(academicTittleSelector));
    }

    public WebElement nextButton() {
        return driver.findElement(nextButton);
    }


}
