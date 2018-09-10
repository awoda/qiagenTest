package qiagen.views;

import org.openqa.selenium.WebDriver;
import qiagen.locators.MyOrganizationLocators;

public class MyOrganizationView {
    private MyOrganizationLocators myOrganizationLocators;

    public MyOrganizationView(WebDriver driver) {
        myOrganizationLocators = new MyOrganizationLocators(driver);
    }

    public void clickRegisterButton(){
        myOrganizationLocators.registerButton().click();
    }

    public void clickBackButton(){
        myOrganizationLocators.backButton().click();
    }

    public void selectFullAccessOption(){
        myOrganizationLocators.unlockAllFeaturesOption().click();
    }

    public void selectLimitedAccess(){
        myOrganizationLocators.noAccessOption().click();
    }

    public void setCustomerNumber(String customerNumber){
        myOrganizationLocators.customerNumberField().clear();
        myOrganizationLocators.customerNumberField().sendKeys(customerNumber);
    }

    public void setOrderConfirmationNumber(String orderConfirmationNumber){
        myOrganizationLocators.orderConfirmationNumberField().clear();
        myOrganizationLocators.orderConfirmationNumberField().sendKeys(orderConfirmationNumber);
    }
}
