package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Util
{
    private By _hTCTouchHDProduct = By.linkText("HTC Touch HD");
    private String expectedTextFromFirstProduct = "HTC Touch HD";
    private By _iPhoneProduct = By.linkText("iPhone");
    private String expectedTextFromSecondProduct = "iPhone";
    private String expectedTextFormShoppingCart = "MacBook";
    private By _actualTextForShoppingCart = By.linkText("MacBook");

    public void toVerifyThatUserShouldBeAbleToAddProductToCartSuccessfully()
    {

        Assert.assertEquals(getTextFromElement(_hTCTouchHDProduct),expectedTextFromFirstProduct," First Product Wrong");
        Assert.assertEquals(getTextFromElement(_iPhoneProduct),expectedTextFromSecondProduct,"Second Product is Wrong");

    }
    public void toVerifyUserAddProductToCartSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_actualTextForShoppingCart),expectedTextFormShoppingCart,"Selected Product is Wrong");
    }

}
