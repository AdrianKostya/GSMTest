package com.shop.mobile.gui.page;

import com.shop.mobile.utilities.Abstract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllBrandsPage extends Abstract {


    @FindBy(xpath = "//*[@class='article-info-name']")
    private WebElement articleName;

    @FindBy(xpath = "//*[@class='st-text']//a")
    private List<WebElement> brandName;

    public AllBrandsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public AllBrandsPage(){}

    public boolean isPageOpened(){
        return articleName.getText().equals("All mobile phone brands");
    }

   public boolean isBrandsSorted(){
       AllBrandsPage sort = new AllBrandsPage();
       return sort.isSorted(brandName);
    }
}
