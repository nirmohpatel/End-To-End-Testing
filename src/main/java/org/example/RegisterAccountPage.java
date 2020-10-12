package org.example;

import org.openqa.selenium.By;

public class RegisterAccountPage extends Util
{
    LoadProperty loadProperty = new LoadProperty();

    private By _firstName = By.xpath("//input[@name=\"firstname\"]");
    private By _lastName = By.xpath("//input[@name=\"lastname\"]");
    private By _email = By.xpath("//input[@name=\"email\"]");
    private By _telephoneNumber = By.xpath("//input[@name=\"telephone\"]");
    private By _password = By.xpath("//input[@name=\"password\"]");
    private By _confirmPassword = By.xpath("//input[@name=\"confirm\"]");
    private By _newsletter = By.xpath("//div[@class=\"col-sm-10\"]/label[2]/input");
    private By _privacyPolicy = By.xpath("//input[@name=\"agree\"]");
    private By _continueButton = By.xpath("//input[@type=\"submit\"]");

    public void toVerifyThatUserShouldAbleEnterRegisterDetailSuccessfully()
    {
        waitUntilElementIsClickAble(_firstName, 40);
        typeText(_firstName, loadProperty.getProperty("FirstName"));
        typeText(_lastName, loadProperty.getProperty("LastName"));
        typeText(_email, loadProperty.getProperty("Email1") + timestamp() + loadProperty.getProperty("Email2"));
        typeText(_telephoneNumber, loadProperty.getProperty("TelephoneNumber"));
        typeText(_password, loadProperty.getProperty("Password"));
        typeText(_confirmPassword, loadProperty.getProperty("ConfirmPassword"));
        clickOnElement(_newsletter);
        clickOnElement(_privacyPolicy);
        clickOnElement(_continueButton);
    }
}
