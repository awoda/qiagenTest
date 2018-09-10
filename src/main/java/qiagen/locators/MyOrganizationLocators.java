package qiagen.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrganizationLocators {

    private static final By registerButton = new By.ByXPath("//button[contains(., 'Register')]");
    private static final By backButton = new By.ByXPath("//button[contains(., 'Back')]");
    private static final By unlockAllFeaturesOption = new By.ByXPath("//urs-collapsible-group/urs-collapsible-panel[1]");
    private static final By noAccessOption = new By.ByXPath("//urs-collapsible-group/urs-collapsible-panel[2]");
    private static final By customerNumberField = new By.ByXPath("//label[contains(., 'Customer number')]/input");
    private static final By orderConfirmationNumberField = new By.ByXPath("//label[contains(., 'Order confirmation number')]/input");
    private WebDriver driver;

    public MyOrganizationLocators(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement registerButton(){
        return driver.findElement(registerButton);
    }

    public WebElement backButton(){
        return driver.findElement(backButton);
    }

    public WebElement unlockAllFeaturesOption(){
        return driver.findElement(unlockAllFeaturesOption);
    }

    public WebElement noAccessOption(){
        return driver.findElement(noAccessOption);
    }

    public WebElement customerNumberField(){
        return driver.findElement(customerNumberField);
    }

    public WebElement orderConfirmationNumberField(){
        return driver.findElement(orderConfirmationNumberField);
    }





}
