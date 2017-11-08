package com.naveencrm.pages;

import com.naveencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveencrm.base.WaitMethod.*;

import javax.swing.*;

public class HomePage extends TestBase {

    @FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
    WebElement currentUser;

    @FindBy(xpath = "//a[contains(text(),'Contacts')]")
    WebElement contactsPageBtn;

    @FindBy(xpath = "//a[contains(text(),'Deals')]")
    WebElement dealsPageBtn;

    @FindBy(xpath = "//a[contains(text(),'Tasks')]")
    WebElement tasksPageBtn;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a")
    WebElement newContactsBtn;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
       return driver.getTitle();
    }

    public boolean verifyCurrentUser(){
        return currentUser.isDisplayed();
    }

    public ContactsPage clickOnContactsPage(){
        contactsPageBtn.click();
        return new ContactsPage();
    }

    public DealsPage clickOnDealsPage(){
        dealsPageBtn.click();
        return new DealsPage();
    }

    public TasksPage clickOnTasksPage(){
        tasksPageBtn.click();
        return new TasksPage();
    }

    public void clickOnNewContactLink(){
        Actions action = new Actions(driver);

        action.moveToElement(contactsPageBtn).build().perform();

        newContactsBtn.click();

    }

}
