package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    WebElement maleGenderOption;

    @FindBy(id = "gender-female")
    WebElement femaleGenderOption;

    @FindBy(id = "FirstName")
    WebElement fNameTxtBox;

    @FindBy(id = "LastName")
    WebElement lNameTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement passwordTxtBox;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxtBox;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    @FindBy (css = "div.result")
    public WebElement successMessage;

    public void userRegistration(String gender, String fName,
                                 String lName, String email,
                                 String password, String confirmPassword){

        if (gender.equalsIgnoreCase("male"))
            clickButton(maleGenderOption);
        else if (gender.equalsIgnoreCase("female"))
            clickButton(femaleGenderOption);

        setTextElementText(fNameTxtBox, fName);
        setTextElementText(lNameTxtBox, lName);
        setTextElementText(emailTxtBox, email);
        setTextElementText(passwordTxtBox, password);
        setTextElementText(confirmPasswordTxtBox, confirmPassword);
        clickButton(registerBtn);
    }}
