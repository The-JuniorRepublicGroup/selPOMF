package com.naveencrm.tests;

import com.naveencrm.base.TestBase;
import com.naveencrm.pages.ContactsPage;
import com.naveencrm.pages.HomePage;
import com.naveencrm.pages.LoginPage;
import com.naveencrm.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends TestBase {

    LoginPage lgnPageObj;
    HomePage hmePageObj;
    ContactsPage cntPageObj;
    TestUtil Util;

    @BeforeMethod
    public void setUp() throws InterruptedException{
        init();
        Util = new TestUtil();
        lgnPageObj = new LoginPage();
        hmePageObj = lgnPageObj.login(TestUtil.USER_NAME, TestUtil.PASS_WD);
        cntPageObj = new ContactsPage();
    }


    @Test(priority = 1)
    public void verifyHomePageTitleTest(){

        Assert.assertEquals(hmePageObj.verifyHomePageTitle(),"CRMPRO", "WRONG Home Page title does not match");
        System.out.println("Page title "+hmePageObj.verifyHomePageTitle()+" matches");

    }

    @Test(priority = 2)
    public void verifyCurrentUserTest(){
        Util.switchToFrame("mainpanel");
        Assert.assertTrue(hmePageObj.verifyCurrentUser());
        System.out.println("current user is naveen k");

    }

    @Test(priority = 3)
    public void clickOnContactsPageTest(){
        Util.switchToFrame("mainpanel");
        cntPageObj = hmePageObj.clickOnContactsPage();
        System.out.println("Click on contacts page successful");

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
