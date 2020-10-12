package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LaptopsNotebooks extends Util {

    private By _macBook = By.xpath("//div[@class=\"row\"]/div[2]/div/div[2]/div[2]/button[1]");


    public void userAbleToSeeAddToCartButtonOnAllProduct() {
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class=\"row\"]/div/div/div[2]/div[2]/button[1]"));
        System.out.println(productList.size());

    //get each product name
    for(WebElement product:productList)

    {
        System.out.println(product.getText());
    }}
    public void clickOnMacBook()
    {
        clickOnElement(_macBook);
    }

}
