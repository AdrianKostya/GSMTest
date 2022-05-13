package com.shop.mobile.gui.page;

import com.shop.mobile.utilities.Abstract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelListPage extends Abstract {

    @FindBy(xpath = "//*[@id='review-body']/div[1]/ul/li[1]/a/img")
    private WebElement firstModelFromList;


    public ModelListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public ModelDescPage getModel(){
        firstModelFromList.click();
        return new ModelDescPage(driver);
    }

}
