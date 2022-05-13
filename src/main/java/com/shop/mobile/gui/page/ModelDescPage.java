package com.shop.mobile.gui.page;

import com.shop.mobile.utilities.Abstract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelDescPage extends Abstract {

    @FindBy(xpath = "//*[@class='article-info-meta']//*[text()='Opinions']")
    private WebElement opinionsBtn;

    public ModelDescPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public OpinionsPage getOpinionsPage(){
        opinionsBtn.click();
        return new OpinionsPage(driver);
    }


}
