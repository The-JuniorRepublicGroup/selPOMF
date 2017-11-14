package com.naveencrm.util;

import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static com.naveencrm.base.TestBase.driver;

public class takeScreenshotAtEndOfTest {

    String osName;

    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String currentDir = System.getProperty("user.dir");





}
