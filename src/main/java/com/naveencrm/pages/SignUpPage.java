package com.naveencrm.pages;

import com.naveencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {

    @FindBy(xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[6]/td[1]/input")
    WebElement checkBox;

    public SignUpPage(){
        PageFactory.initElements(driver, this);
    }

    public void somethineStupid(){


    }

}
