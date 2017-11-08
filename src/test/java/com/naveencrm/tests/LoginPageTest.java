package com.naveencrm.tests;

import com.naveencrm.base.TestBase;
import com.naveencrm.pages.HomePage;
import com.naveencrm.pages.LoginPage;
import com.naveencrm.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends TestBase {

    LoginPage lgnPageObj;
    HomePage hmePageObj;

    @BeforeTest
    public void setUp(){

        init();
        lgnPageObj = new LoginPage();

    }


    @Test(priority = 1)
    public void loginPageTitleTest(){

        Assert.assertEquals(lgnPageObj.validateLoginPageTitle(), "#1 Free CRM for Any Business: Online Customer Relationship Software");
        System.out.println("Login Page Title matches, Test PASSED");

    }

    @Test(priority = 2)
    public void crmLogoTest(){

        Assert.assertTrue(lgnPageObj.validateCRMLogoImage());
        System.out.println("CRMLogo is displaying, Test PASSED");

    }

    @Test(priority = 3)
    public void signInTest() throws InterruptedException{

        hmePageObj = lgnPageObj.login(TestUtil.USER_NAME, TestUtil.PASS_WD);
        System.out.println("Login Successful, Test PASSED");

    }


    @AfterTest
    public void tearDown(){

        driver.quit();

    }


}
