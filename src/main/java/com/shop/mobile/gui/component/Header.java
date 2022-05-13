package com.shop.mobile.gui.component;

import com.shop.mobile.utilities.Abstract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Header extends Abstract {

    @FindBy(xpath = "//*[@class='head-icon icon-tip-us icomoon-liga']")
    private WebElement tipUsBtn;

    @FindBy(className = "yt-icon")
    private WebElement youtubeBtn;

    @FindBy(xpath = "//*[@class='head-icon icon-instagram icomoon-liga']")
    private WebElement instaBtn;

    @FindBy(xpath = "//*[@class='head-icon icon-soc-rss2 icomoon-liga']")
    private WebElement rssBtn;

    public Header(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isTipUsPresent(){
       return tipUsBtn.isDisplayed();
    }

    public boolean isYoutubePresent(){
        return youtubeBtn.isDisplayed();
    }

    public boolean isInstaPresent(){
        return instaBtn.isDisplayed();
    }

    public boolean isRssPresent(){
        return rssBtn.isDisplayed();
    }

    public void isAllIconsPresent(SoftAssert softAssert){
        softAssert.assertTrue(isTipUsPresent());
        softAssert.assertTrue(isYoutubePresent());
        softAssert.assertTrue(isInstaPresent());
        softAssert.assertTrue(isRssPresent());
    }


}
