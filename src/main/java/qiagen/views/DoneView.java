package qiagen.views;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import qiagen.locators.DoneLocators;

public class DoneView {
    private DoneLocators doneLocators;

    public DoneView(WebDriver driver) {
        doneLocators = new DoneLocators(driver);
    }

    public boolean isRegistrationConfirmationVisible(){
        try{
            doneLocators.registrationConfirmation();
        }
        catch (NoSuchElementException e){
            return false;
        }
        return true;
    }
}
