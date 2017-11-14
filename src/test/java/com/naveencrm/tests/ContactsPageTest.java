package com.naveencrm.tests;

import com.naveencrm.base.TestBase;
import com.naveencrm.pages.ContactsPage;
import com.naveencrm.pages.HomePage;
import com.naveencrm.pages.LoginPage;
import com.naveencrm.util.ExcelLoopLogic;
import com.naveencrm.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

public class ContactsPageTest extends TestBase{

    LoginPage lgnPageObj;
    HomePage hmePageObj;
    ContactsPage cntPageObj;
    TestUtil Util;
    ExcelLoopLogic smthng;

    @BeforeTest
    public void setUp() throws InterruptedException{
        init();
        Util = new TestUtil();
        lgnPageObj = new LoginPage();
        hmePageObj = lgnPageObj.login(TestUtil.USER_NAME, TestUtil.PASS_WD);
        cntPageObj = new ContactsPage();
        Util.switchToFrame("mainpanel");
        System.out.println("Switched to mainpanel frame");
        cntPageObj = hmePageObj.clickOnContactsPage();
        smthng = new ExcelLoopLogic();
    }


    @Test(priority = 1)
    public void verifyContactLabelTest(){

        Assert.assertTrue(cntPageObj.verifyContactsLabel());
        System.out.println("Contact Label Verified");


    }

    @Test(priority = 2)
    public void checkACustomer() throws InterruptedException{


        Thread.sleep(3000);
        cntPageObj.selectAContactCheckBox();
        Thread.sleep(3000);
        System.out.println("checkBox clicked");

    }

    @Test(priority = 3)
    public void addNewContactTest(){

        hmePageObj.clickOnNewContactLink();
        cntPageObj.createNewContact("Mr.", "John", "Brown", "Something and Associates, LLC.");

    }

    @DataProvider(name = "containerInformation")
    public Object[][] getNewContactTestData() throws Exception {

        Object[][] data = smthng.testData(TestUtil.TESTDATA_FILE_PATH, TestUtil.sheetName);
        return data;

    }

    @Test(priority = 4, dataProvider = "containerInformation")
    public void fillContactInformation(String Thetitle, String firstName, String lastName, String theCompany){

        hmePageObj.clickOnNewContactLink();
        cntPageObj.createNewContact(Thetitle,firstName,lastName,theCompany);
//        System.out.println("Values entered for: "+ Thetitle+" "+firstName+" "+lastName+" at "+theCompany);

    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
