package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    private By _myAccount = By.xpath("//span[text()=\"My Account\"]");
    private String expectedStringMassage = "Your Store";
    private By _actualText = By.xpath("//a[text() = \"Your Store\"]");
    private By _registerButton = By.linkText("Register");
    private By _phones_PDAs = By.xpath("//a[text()=\"Phones & PDAs\"]");
    private By _laptopsNotebooks = By.linkText("Laptops & Notebooks");
    private By _showAllLaptopsNotebooks = By.linkText("Show All Laptops & Notebooks");
    private By _shoppingCartButton = By.xpath("//span[text()=\"Shopping Cart\"]");
    private By _searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");

    public void toVerifyThatUserIsOnHomePage()
    {
        softAssert.assertEquals(getTextFromElement(_actualText), expectedStringMassage, "User is on home page");
        softAssert.assertAll("User in not on Home Page");
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(_myAccount);

        clickOnElement(_registerButton);
    }
    public void clickOnPhoneAndPDAs()
    {
        clickOnElement(By.xpath("//a[text()=\"Phones & PDAs\"]"));
    }
    public void clickOnCategoryLink(String categoryLink)
    {
        clickOnElement(By.linkText(categoryLink));
    }

    public void clickOnLaptopsNotebooks()
    {
        clickOnElement(_laptopsNotebooks);
        clickOnElement(_showAllLaptopsNotebooks);
    }
    public void clickOnShoppingCartButton()
    {
        javaScriptClickOnElement(_shoppingCartButton);
        //clickOnElement(_shoppingCartButton);
    }
}
