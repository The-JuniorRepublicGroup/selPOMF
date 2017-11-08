package com.naveencrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod extends TestBase {

    public WebDriverWait wait;

    public WaitMethod(WebDriver driver){

        this.wait = new WebDriverWait(this.driver, 20);

    }


    public WebDriverWait getWait(){

        return wait;

    }

}
