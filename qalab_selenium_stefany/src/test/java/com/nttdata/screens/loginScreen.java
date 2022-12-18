package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class loginScreen extends PageObject{

    //@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    @AndroidFindBy(id = "2131430400")
    //@AndroidFindBy(id = "Close")
    //android.widget.ImageButton[@content-desc="Close"]
    private WebElement btnClose;

    public void clickClose(){
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        btnClose.click();
    }
}
