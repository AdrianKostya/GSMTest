package com.shop.mobile;

import com.shop.mobile.gui.page.*;
import com.shop.mobile.utilities.Abstract;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GuiTest  extends Abstract {

    @Test
    public void isAllElementsPresent(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());
        homePage.getHeader().isAllIconsPresent(softAssert);
        softAssert.assertAll();
    }

    @Test
    public void isBrandsSorted(){
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());
        AllBrandsPage allBrandsPage = homePage.getAllBrandsPage();
        Assert.assertTrue(allBrandsPage.isPageOpened());
        Assert.assertTrue(allBrandsPage.isBrandsSorted());

    }

//    @Test
//    public void isDateSortingNewestFirst(){
//        HomePage homePage = new HomePage(driver);
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened());
//        ModelListPage modelListPage = homePage.getPhone("Lenovo");
//        homePage.closeAgree();
//        ModelDescPage modelDescPage = modelListPage.getModel();
//        OpinionsPage opinionsPage = modelDescPage.getOpinionsPage();
//        opinionsPage.isDateNewestFirst();
//
//    }





}
