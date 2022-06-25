package com.shop.mobile.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Abstract {

    protected static WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterTest
    public void after(){
        driver.quit();
    }

    public boolean isSorted(List<WebElement> list){
        List<String> nonSortedListStr = new ArrayList<>();
        if(!list.isEmpty()){
        for (WebElement eachElement:list) {
            nonSortedListStr.add(eachElement.getText());
            }
            List<String> listSorted = nonSortedListStr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            return nonSortedListStr.equals(listSorted);
        }
        return false;
    }

}
