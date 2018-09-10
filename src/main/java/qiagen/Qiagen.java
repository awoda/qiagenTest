package qiagen;

import org.openqa.selenium.WebDriver;
import qiagen.views.DoneView;
import qiagen.views.MyDetailsView;
import qiagen.views.MyOrganizationView;

public class Qiagen {

    private static final String registrationUrl = "https://qa-preproduction.qiagen.com/userregistration/form";
    private static final String registrationCompanyPartUrl = registrationUrl + "/company";
    private static final String registrationPersonalPartUrl = registrationUrl + "/personal";
    private WebDriver driver;

    private DoneView doneView;
    private MyDetailsView myDetailsView;
    private MyOrganizationView myOrganizationView;

    public Qiagen(WebDriver driver) {
        this.driver = driver;

        doneView = new DoneView(driver);
        myDetailsView = new MyDetailsView(driver);
        myOrganizationView = new MyOrganizationView(driver);
    }

    public void openRegistrationPage() {
        driver.get(registrationUrl);
    }


    public void fillUserData(String email,
                             String password,
                             String location,
                             String phoneNumber,
                             String title,
                             String academicTitle,
                             String firstName,
                             String lastName){

        myDetailsView.setEmail(email);
        myDetailsView.setPassword(password);
        myDetailsView.setLocation(location);
        myDetailsView.setTelephone(phoneNumber);
        myDetailsView.setTitle(title);
        myDetailsView.setAcademicTitle(academicTitle);
        myDetailsView.setFirstName(firstName);
        myDetailsView.setLastName(lastName);
    }


    public void acceptUserForm() {
        myDetailsView.clickNextButton();
    }

    public boolean isUserFormAccepted() {
        return driver.getCurrentUrl().equalsIgnoreCase(registrationCompanyPartUrl);
    }

    public void registerWithFullAccess(String customerNumber, String orderConfirmationNumber) {
        myOrganizationView.selectFullAccessOption();
        myOrganizationView.setCustomerNumber(customerNumber);
        myOrganizationView.setOrderConfirmationNumber(orderConfirmationNumber);

        myOrganizationView.clickRegisterButton();
    }

    public void registerWithLimitedAccess() {
        myOrganizationView.selectLimitedAccess();
        myOrganizationView.clickRegisterButton();
    }

    public boolean isUserRegistered() {
        return doneView.isRegistrationConfirmationVisible();
    }
}
