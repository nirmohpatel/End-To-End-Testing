package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PhonesAndPDAs extends Util
{

    private By _hTCTouchHD = By.xpath("//div[@class=\"row\"]/div[1]/div[1]/div[2]/div[2]/button[1]/span");
    private By _iPhone = By.xpath("//div[@class=\"row\"]/div[2]/div[1]/div[2]/div[2]/button/span");
    private By _shoppingCartButton = By.xpath("//span[text()=\"Shopping Cart\"]");

    public void toVerifyUserAddHTCTouchHDProductInToCart()
    {
        clickOnElement(_hTCTouchHD);

    }
    public void toVerifyUserAddIphoneProductInToCart()
    {
        javaScriptClickOnElement(_iPhone);
        //clickOnElement(_iPhone);
    }

    public void clickOnShoppingCartButton()
    {
        javaScriptClickOnElement(_shoppingCartButton);
        //clickOnElement(_shoppingCartButton);
    }

}
