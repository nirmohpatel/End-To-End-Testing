package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class YourAccountHasBeenCreatedPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    private String _expectedURL = "http://tutorialsninja.com/demo/index.php?route=account/success";
    private By _continueButton = By.xpath("//a[text()=\"Continue\"]");
    public void toVerifyUserIsSuccessfullyRegister()
    {
        String actualURL = driver.getCurrentUrl();
        softAssert.assertEquals((actualURL), _expectedURL, "User is register successfully");
        softAssert.assertAll();
        clickOnElement(_continueButton);
    }
}
