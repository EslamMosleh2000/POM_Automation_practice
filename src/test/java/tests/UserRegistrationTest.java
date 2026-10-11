package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {
    HomePage homeObject ;
    UserRegistrationPage registrationObject ;

    String gender="male";
    String fName = "Islam";
    String lName = "Mosleh";
    String email = "Islam.3@gmail.com";
    String password = "asdasdasd";
    String confirmPassword = "asdasdasd";


    @Test
    public void UserCanRegisterSuccessfully() {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();

        registrationObject = new UserRegistrationPage(driver);
        registrationObject.userRegistration(gender, fName, lName, email, password, confirmPassword);

        Assert.assertTrue(registrationObject.successMessage.getText().contains("Your registration completed"));
    }
}
