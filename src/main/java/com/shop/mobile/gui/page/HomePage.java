package com.shop.mobile.gui.page;

import com.shop.mobile.gui.component.Header;
import com.shop.mobile.utilities.Abstract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Abstract {

    @FindBy(className = "top-bar clearfix")
    private Header header;

    @FindBy(id = "review-sample")
    private WebElement advertiseWindow;

    @FindBy(xpath = "//*[@class='pad-multiple pad-allbrands']")
    private WebElement allBrandsBtn;

    @FindBy(xpath = "//*[@id='review-body']/div[1]/ul/li[1]/a/img")
    private WebElement firstBrendFromList;

    String brand =   "//a[text()='%s']";


    public HomePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void open(){
        driver.get("https://www.gsmarena.com/");
    }

    public boolean isPageOpened(){
        return advertiseWindow.isDisplayed();
    }

    public Header getHeader(){
        return new Header(driver);
    }

    public AllBrandsPage getAllBrandsPage(){
        allBrandsBtn.click();
        return new AllBrandsPage(driver);
    }

    public ModelListPage getPhone(String brand1){
     driver.findElement(By.xpath(String.format(brand, brand1))).click();
     return new ModelListPage(driver);
    }

    public void closeAgree(){
        if(driver.findElement(By.xpath("//*[text()='Agree and proceed']")).isDisplayed()){
            driver.findElement(By.xpath("//*[text()='Agree and proceed']")).click();
        }
    }



    }



