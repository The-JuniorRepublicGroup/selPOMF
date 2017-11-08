//package com.naveencrm.base;
//
//import com.naveencrm.util.TestUtil;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import static com.naveencrm.config.properties.*;
//
//public class TestBase {
//
//    public static WebDriver driver;
//    static Properties prop;
//
//    // Constructor... the first method here reads the properties file or just create an interface and import those
//    /***
//     * Going to use interface class
//     * ***/
//
//    public TestBase(){
//
//        try {
//            prop = new Properties();
//            FileInputStream ip = new FileInputStream(
//                    System.getProperty("user.dir") + "/src/main/java/com/naveencrm/config/config.properties");
//            prop.load(ip);
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//    public static void  init(){
//
////        String browserName = prop.getProperty("browser");
//        if(browserName.equalsIgnoreCase(browserName)){
//            driver = new ChromeDriver();
//        } else {
//            System.out.println("wrong browser");
//
//        }
//
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);
//
//
//        driver.get(baseURL);
//
//    }
//
//
//
//
//
//
//
//
//    // could possibly use the method below
////    public WebDriver startBrowser(String browserName, String baseURL)
////    {
////        if(browserName.equalsIgnoreCase("firefox"))
////        {
////            driver = new FirefoxDriver();
////        } else if(browserName.equalsIgnoreCase("chrome"))
////        {
////            driver = new ChromeDriver();
////        } else if(browserName.equalsIgnoreCase("IE"))
////        {
////            driver = new InternetExplorerDriver();
////        }
////
////
////        driver.manage().window().maximize();
////        driver.get(baseURL);
////        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////
////        return driver;
////    }
//
//
//}
