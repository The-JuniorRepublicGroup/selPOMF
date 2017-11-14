//package com.naveencrm.util;
//
//import com.naveencrm.base.TestBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SourceType;
//import org.openqa.selenium.support.events.WebDriverEventListener;
//
//import java.io.IOException;
//
//
//public class WebEventListener extends TestBase implements WebDriverEventListener{
//
//    public void beforeAlertAccept(WebDriver webDriver) {
//
//    }
//
//    public void afterAlertAccept(WebDriver webDriver) {
//
//    }
//
//    public void afterAlertDismiss(WebDriver webDriver) {
//
//    }
//
//    public void beforeAlertDismiss(WebDriver webDriver) {
//
//    }
//
//    public void beforeNavigateTo(String url, WebDriver driver){
//        System.out.println("Before navigating to:" + "" + url );
//    }
//
//    public void afterNavigateTo(String url, WebDriver driver){
//        System.out.println("After navigating to: "+ "" + url);
//    }
//
//    public void beforeNavigateBack(WebDriver webDriver) {
//
//    }
//
//    public void afterNavigateBack(WebDriver webDriver) {
//
//    }
//
//    public void beforeNavigateForward(WebDriver webDriver) {
//
//    }
//
//    public void afterNavigateForward(WebDriver webDriver) {
//
//    }
//
//    public void beforeNavigateRefresh(WebDriver webDriver) {
//
//    }
//
//    public void afterNavigateRefresh(WebDriver webDriver) {
//
//    }
//
//    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
//
//    }
//
//    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
//
//    }
//
//    public void beforeClickOn(WebElement element, WebDriver driver){
//        System.out.println("Trying to click on: "+ ""+ element.toString());
//    }
//
//    public void afterClickOn(WebElement element, WebDriver driver){
//        System.out.println("Clicked on: "+ element.toString());
//    }
//
//    public void beforeChangeValueOf(WebElement element, WebDriver webDriver, CharSequence[] charSequences) {
//        System.out.println("Before any change element is: "+ ""+ element.toString());
//    }
//
//    public void afterChangeValueOf(WebElement element, WebDriver webDriver, CharSequence[] charSequences) {
//        System.out.println("ELement value changed to: "+ ""+ element.toString());
//    }
//
//    public void beforeScript(String s, WebDriver webDriver) {
//
//    }
//
//    public void afterScript(String s, WebDriver webDriver) {
//
//    }
//
//    public void onException(Throwable error, WebDriver webDriver) {
//        System.out.println("Exception occured: "+ error);
////        try{
////            takeScreenshotAtEndOfTest();
////        }catch (IOException e){
////            e.printStackTrace();
////        }
//    }
//
//}
