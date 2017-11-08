package com.naveencrm.util;

/***
 * loops through excel sheet using sheetName
 *
 * sample logic -------------------
 @Test(dataProvider = "cityData")
 public void fillCityForm(String city)
 {
 System.out.println("cities: "+ city);
 }


 // data provider that calls logic to get its object data
 @DataProvider(name = "cityData")
 public Object[][] cityWeatherData() throws Exception
 {
 Object[][] data = testData(xlFilePath, sheetName);
 return data;
 }


  * ---------------------------------
 **/



public class ExcelLoopLogic {

    ExcelLogic dp;

    //TODO: find a logic to dynamically find sheetName instead of hard coding them...


    // logic for looping through columns and rows of excel
    public Object[][] testData(String xFilePath, String sheetName) throws Exception
    {
        Object[][] execelData;
        dp = new ExcelLogic(xFilePath);

        // find out how many rows and columns are in the excel sheet
        int rows = dp.getRowCount(sheetName);
        int columns = dp.getColumnCount(sheetName);

        // place the defined row and column counts into data provider object(using rows-1 in order to skip header)
        execelData = new Object[rows - 1][columns];
        for(int r=1; r < rows; r++)
        {
            for(int c=0; c < columns; c++)
            {
                execelData[r-1][c] = dp.getCellData(sheetName,r,c);
            }
        }

        return execelData;

    }

}
