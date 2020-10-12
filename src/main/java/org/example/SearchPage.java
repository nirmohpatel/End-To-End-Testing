package org.example;

import org.openqa.selenium.By;

public class SearchPage extends Util
{
    private By _allCategoriesField = By.xpath("//select[@class=\"form-control\"]");
    private By _searchButton = By.xpath("//input[@id=\"button-search\"]");

    public void toVerifyAllCategoriesAndSelectCategory()
    {
        clickOnElement(_allCategoriesField);

    }
}
