package com.naveencrm.pages;

import com.naveencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends TestBase {

    WebDriverWait wait = new WebDriverWait(this.driver, 20);

    /***
     *
     * Webelements for the page and defined and assigned
     *
     * ***/
    @FindBy(how = How.NAME, using = "username")
    WebElement usernameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div/input")
    WebElement loginBtn;

    @FindBy(xpath = "//button[container(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
    WebElement loginPageLogo;


    // Initialize loginPageObj
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }



    /***
     *
     * These will be the actions for the page
     *
     * ***/
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMLogoImage(){
        return loginPageLogo.isDisplayed();
    }

    public HomePage login(String username, String password) throws InterruptedException{
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
//        try {
//            loginBtn.click();
//        } catch (Exception e) {
//            System.out.println("Button not clickable");
//
//        }

        return new HomePage();



        /**
         *
         * can possibly change to this to avoid having to use thread.sleep
         *
         *
         * login(String un, String pwd){
         username.sendKeys(un);
         password.sendKeys(pwd);
         //loginBtn.click();
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].click();", loginBtn);




         return new HomePage();
         }﻿
         * */


    }

}
