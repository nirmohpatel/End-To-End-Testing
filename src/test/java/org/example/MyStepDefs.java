package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepDefs
{
    HomePage homePage = new HomePage();
    RegisterAccountPage registerAccountPage = new RegisterAccountPage();
    YourAccountHasBeenCreatedPage yourAccountHasBeenCreatedPage = new YourAccountHasBeenCreatedPage();
    PhonesAndPDAs phonesAndPDAs = new PhonesAndPDAs();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LaptopsNotebooks laptopsNotebooks = new LaptopsNotebooks();

    @Given("^User is on Home$")
    public void user_is_on_Home()
    {
      homePage.toVerifyThatUserIsOnHomePage();
    }

    @When("^User click on My Account and Register Button$")
    public void user_click_on_My_Account_and_Register_Button()
    {
        homePage.clickOnRegisterButton();
    }

    @And("^User enter all required registration detail$")
    public void user_enter_all_required_registration_detail()
    {
     registerAccountPage.toVerifyThatUserShouldAbleEnterRegisterDetailSuccessfully();
    }

    @Then("^User should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()
    {
        yourAccountHasBeenCreatedPage.toVerifyUserIsSuccessfullyRegister();
    }

    @Given("^User is on homepage$")
    public void user_is_on_homepage()
    {
        homePage.toVerifyThatUserIsOnHomePage();
        homePage.clickOnPhoneAndPDAs();
    }

    @When("^User click on HTC Touch HD add to cart button$")
    public void user_click_on_HTC_Touch_HD_add_to_cart_button()
    {
        phonesAndPDAs.toVerifyUserAddHTCTouchHDProductInToCart();
    }

    @And("^User click on iphone add to cart button$")
    public void user_click_on_iphone_add_to_cart_button()
    {
        phonesAndPDAs.toVerifyUserAddIphoneProductInToCart();
    }

    @Then("^User should be able to add product to cart successfully$")
    public void user_should_be_able_to_add_product_to_cart_successfully()
    {
        phonesAndPDAs.clickOnShoppingCartButton();
        shoppingCartPage.toVerifyThatUserShouldBeAbleToAddProductToCartSuccessfully();
    }

    @Given("^user is on Homepage$")
    public void user_is_on_Homepage()
    {
        homePage.toVerifyThatUserIsOnHomePage();
    }

    @When("^User click on each \"([^\"]*)\"$")
    public void user_click_on_each(String categoryLink )
    {
        homePage.clickOnCategoryLink(categoryLink);
    }

    @Then("^User able to navigate to \"([^\"]*)\" successfully$")
    public void user_able_to_navigate_to_successfully(String _ExpectedUrl)
    {
        Assert.assertEquals(Util.getURL(),_ExpectedUrl);
    }
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page()
    {
        homePage.toVerifyThatUserIsOnHomePage();


    }

    @When("^User click on show Laptops & Netbooks category page$")
    public void user_click_on_show_Laptops_Netbooks_category_page()
    {
        homePage.clickOnLaptopsNotebooks();
    }

    @When("^User can see all Add to cart button on all laptops product$")
    public void user_can_see_all_Add_to_cart_button_on_all_laptops_product()
    {
        laptopsNotebooks.userAbleToSeeAddToCartButtonOnAllProduct();
    }

    @When("^User can able to click on add to cart button for selected$")
    public void user_can_able_to_click_on_add_to_cart_button_for_selected()
    {
        laptopsNotebooks.clickOnMacBook();
    }

    @Then("^User can able to add product to cart successfully$")
    public void userCanAbleToAddProductToCartSuccessfully()
    {
        homePage.clickOnShoppingCartButton();
        shoppingCartPage.toVerifyUserAddProductToCartSuccessfully();
    }
}
