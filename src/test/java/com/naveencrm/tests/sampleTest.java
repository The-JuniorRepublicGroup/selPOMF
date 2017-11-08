package com.naveencrm.tests;

import com.naveencrm.base.TestBase;
import com.naveencrm.util.ExcelLoopLogic;
import com.naveencrm.util.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleTest extends TestBase {

    String sheetName = "NewContact";
    ExcelLoopLogic jp;


    @DataProvider(name = "contactInformation")
    public Object[][] cityWeatherData() throws Exception
    {
        jp = new ExcelLoopLogic();

        Object[][] data;
        data = jp.testData(TestUtil.TESTDATA_FILE_PATH, sheetName);
        return data;
    }

    @Test(dataProvider = "contactInformation")
    public void someRandomTest(String Thetitle, String firstName, String lastName, String theCompany){


        System.out.println("These are the fout columns: " +Thetitle+ " " +firstName+ " " +lastName+ " - " + theCompany);


    }

}
