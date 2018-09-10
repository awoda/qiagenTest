package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qiagen.Qiagen;
import utils.TestData;


public class TestSelenium {

    private static WebDriver driver;
    private static Qiagen qiagen;

    @BeforeClass
    public static void suiteSetup() {
        driver = new ChromeDriver();
        qiagen = new Qiagen(driver);

    }

    @AfterClass
    public static void suiteTeardown() {
        driver.quit();
    }

    @Before
    public void testSetup() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void fullAccessRegistrationTest() {
        qiagen.openRegistrationPage();
        qiagen.fillUserData(TestData.User1.email,
                TestData.User1.password,
                TestData.User1.location,
                TestData.User1.phoneNumber,
                TestData.User1.title,
                TestData.User1.academicTitle,
                TestData.User1.firstName,
                TestData.User1.lastName);

        qiagen.acceptUserForm();
        Assert.assertTrue(qiagen.isUserFormAccepted());

        qiagen.registerWithFullAccess(TestData.User1.customerNumber, TestData.User1.orderConfirmationNumber);
        Assert.assertTrue(qiagen.isUserRegistered());
    }

    @Test
    public void limitedAccessRegistrationTest() {
        qiagen.openRegistrationPage();
        qiagen.fillUserData(TestData.User1.email,
                TestData.User1.password,
                TestData.User1.location,
                TestData.User1.phoneNumber,
                TestData.User1.title,
                TestData.User1.academicTitle,
                TestData.User1.firstName,
                TestData.User1.lastName);

        qiagen.acceptUserForm();
        Assert.assertTrue(qiagen.isUserFormAccepted());

        qiagen.registerWithLimitedAccess();
        Assert.assertTrue(qiagen.isUserRegistered());
    }


    @Test
    public void failedRegistrationTest() {
        qiagen.openRegistrationPage();
        qiagen.fillUserData(TestData.User2.email,
                TestData.User2.password,
                TestData.User2.location,
                TestData.User2.phoneNumber,
                TestData.User2.title,
                TestData.User2.academicTitle,
                TestData.User2.firstName,
                TestData.User2.lastName);

        qiagen.acceptUserForm();
        Assert.assertTrue(qiagen.isUserFormAccepted());

        qiagen.registerWithFullAccess(TestData.User2.customerNumber, TestData.User2.orderConfirmationNumber);
        Assert.assertFalse(qiagen.isUserRegistered());
    }

}
