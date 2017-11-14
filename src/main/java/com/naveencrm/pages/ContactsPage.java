package com.naveencrm.pages;

import com.naveencrm.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.naveencrm.base.coreMethods.*;

public class ContactsPage extends TestBase {

//    WebDriverWait wait = new WebDriverWait(this.driver, 20);

    @FindBy(xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[1]/td/table/tbody/tr/td[1]")
    WebElement contactPageHeadingTxt;

    @FindBy(xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[6]/td[1]/input")
    WebElement checkBox;

    @FindBy(id = "first_name")
    WebElement firstNameField;

    @FindBy(id = "surname")
    WebElement lastNameField;

    @FindBy(name = "client_lookup")
    WebElement companyNameField;

    @FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")
    WebElement saveBtn;

    public ContactsPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean verifyContactsLabel(){
        return contactPageHeadingTxt.isDisplayed();
    }

    public void selectAContactCheckBox(){

        getWaiter().until(ExpectedConditions.elementToBeClickable(checkBox));
        checkBox.click();
    }

    public void createNewContact(String title, String fname, String lname, String cmpname){
        Select select = new Select(driver.findElement(By.name("title")));
        select.selectByVisibleText(title);
        firstNameField.sendKeys(fname);
        lastNameField.sendKeys(lname);
        companyNameField.sendKeys(cmpname);
        getWaiter().until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
//        saveBtn.click();
    }
}
