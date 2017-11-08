package com.naveencrm.base;

import com.naveencrm.util.TestUtil;
import com.naveencrm.util.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.naveencrm.config.properties.*;

public class TestBase {

    public static WebDriver driver;
//    public static WebDriverWait wait  = new WebDriverWait(driver, 20);
    public static EventFiringWebDriver e_driver;
    public static WebEventListener evenListener;

    public static void  init(){

        if(browserName.equalsIgnoreCase("Firefox"))
                {
                    driver = new FirefoxDriver();
                }
        else if(browserName.equalsIgnoreCase("Chrome"))
                {
                    driver = new ChromeDriver();
                }
        else if(browserName.equalsIgnoreCase("IE"))
                {
                    driver = new InternetExplorerDriver();
                }

        e_driver = new EventFiringWebDriver(driver);
        // now create object of eventlistenerhandler to register it with eventfiringwebdriver
        evenListener = new WebEventListener();  // <--- this must be registered with WebEventListener
        e_driver.register(evenListener);
        driver = e_driver;

        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);




    }




}
