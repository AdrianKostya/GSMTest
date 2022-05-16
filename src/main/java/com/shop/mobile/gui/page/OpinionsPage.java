package com.shop.mobile.gui.page;

import com.shop.mobile.utilities.Abstract;
import org.ocpsoft.prettytime.PrettyTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class OpinionsPage extends Abstract {

    @FindBy(xpath = "//*[@id='sort-comments']//*[text()='Newest first']")
    private WebElement newestBtn;

    @FindBy(xpath = "//*[@class='upost']")
    private List<WebElement> postedTime;

    public OpinionsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    //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
    //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




//    public void isDateNewestFirst(){
//        SimpleDateFormat allDate = new SimpleDateFormat("dd MMM yyyy hh:min aa");
//        SimpleDateFormat dateonly = new SimpleDateFormat("dd MMM yyyy");
//        Date date = new Date();
//        newestBtn.click();
//        List<String> postedTimeStr = new ArrayList<>();
//        for (WebElement eachTimeStr:postedTime){
//            postedTimeStr.add(eachTimeStr.getText());
//            System.out.println("Time is : "+eachTimeStr.getText());
//        }
//        List<String> passDataInDataFormat = new ArrayList<>();
//            for (String postedTimeStrEach : postedTimeStr) {
//                String eachTotal []= postedTimeStrEach.split(" ");
//                System.out.println("each total == : "+eachTotal[1]);
//                if(eachTotal[1].equals("minutes")){
//                    String min = eachTotal[0];
//                    Integer minInt = Integer.parseInt(min);
//                    Calendar c = ;
//                }else if(eachTotal[1].equals("hours")){
//                    String hours = eachTotal[0];
//                    long hoursL = Long.parseLong(hours);
//                    PrettyTime prettyTime = new PrettyTime();
//                    System.out.println("Time minus few hours is "+prettyTime.format(LocalDateTime.now().minusHours(hoursL)));
//                    passDataInDataFormat.add(prettyTime.format(LocalDateTime.now().minusHours(hoursL)));
//                }else if(!postedTimeStrEach.equals("minutes")&& !postedTimeStr.equals("hours")){
//                    postedTimeStrEach
//                }


//
//        }
//    }



}
