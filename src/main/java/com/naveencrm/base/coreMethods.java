/***
 * This class will containing all the resuseable methods
 * methods like getWait
 * waitUntilElement is clickable
 * elementExists
 * **/


package com.naveencrm.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class coreMethods extends TestBase {

    // may need to later on make this using "this.driver"
    public static WebDriverWait wait  = new WebDriverWait(driver, 20);


    public static WebDriverWait getWaiter(){
        return wait;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void MakeThreadSleep(int SleepTime){
        try{
            Thread.sleep(SleepTime);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clickJSElement(WebElement element){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
    }

    public List<String> getDropdownListOptions(Select passedSelect){
        List<WebElement> options = passedSelect.getOptions();
        List<String> optionStrings = new ArrayList<String>();
        for (WebElement option : options){
            optionStrings.add(option.getText());
        }
        return optionStrings;
    }

    public void handleAlert(){
        try{
            getWaiter().until(ExpectedConditions.alertIsPresent());
            Alert alert = getDriver().switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e){
            throw e;
        }
    }

    public List<String> getElementsListText(List<WebElement> elementList) {
        List<String> elementListText = new ArrayList<String>();
        for(WebElement element : elementList){
            String elementText = element.getAttribute("innerText");
            elementListText.add(elementText);
        }
        return elementListText;
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        MakeThreadSleep(500);
    }

}
