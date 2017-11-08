package com.naveencrm.base;

import com.naveencrm.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.naveencrm.config.properties.*;

public class TestBase {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void  init(){

        if(browserName.equalsIgnoreCase("firefox"))
                {
                    driver = new FirefoxDriver();
                }
        else if(browserName.equalsIgnoreCase("chrome"))
                {
                    driver = new ChromeDriver();
                }
        else if(browserName.equalsIgnoreCase("IE"))
                {
                    driver = new InternetExplorerDriver();
                }


        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);




    }




}
