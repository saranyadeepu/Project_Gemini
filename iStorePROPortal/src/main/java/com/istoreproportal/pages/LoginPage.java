package com.istoreproportal.pages;


import com.istoreproportal.utilities.ObjectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends ObjectUtility {
    WebDriver driver;

    /** page constructor **/

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /** page elements **/

    private final String _username = "//input[@id='login']";
    @FindBy(xpath = _username)
    private WebElement username;

    private final String _password = "//input[@id='password']";
    @FindBy(xpath = _password)
    private WebElement password;

    private final String _loginButton = "//button[@id='login-user']";
    @FindBy(xpath = _loginButton)
    private WebElement loginButton;

    private final String _forgotPassword = "//button[@id='olvidado']";
    @FindBy(xpath = _forgotPassword)
    private WebElement forgotPassword;

    /** user action methods **/

    public String getLoginPageTitle() {
        String loginTitle = page.getPageTitle(driver);
        return loginTitle;
    }
    public void enterUsername(String uName) {
        page.enterText(username, uName);
    }
    public void enterPassword(String pass) {
        page.enterText(password, pass);
    }
    public MyAccountPage clickOnloginButton() {
        page.clickOnElement(loginButton);
        return new MyAccountPage(driver);
    }

}
