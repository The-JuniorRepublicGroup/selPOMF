package com.naveencrm.util;

import com.naveencrm.base.TestBase;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtil extends TestBase {

    public FileInputStream fis;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;


    public static long PAGE_LOAD_TIMEOUT = 20;


    public static long IMPLICIT_WAIT_TIME = 10;


    public static String USER_NAME = "naveenk";


    public static String PASS_WD = "test@123";

    private static String BASE_PAT = System.getProperty("user.dir");;

    public static String TESTDATA_FILE_PATH = BASE_PAT+"/src/main/java/com/naveencrm/testdata/NaveenTestData.xlsx";

    public static String sheetName = "NewContact";

    public void switchToFrame(String frameName){
        driver.switchTo().frame(frameName);
    }




    /**
     * Methods below are about getting the data from below and looping through**
     *
     * ***/

//    public void setUpCellData(String xlFilePath) throws Exception{
//
//        fis = new FileInputStream(xlFilePath);
//        workbook = new XSSFWorkbook(fis);
//        fis.close();
//
//    }
//
//    public String getCellData(String sheetName, int rowNum, int colNum)
//    {
//
//        try{
//            sheet = workbook.getSheet(sheetName);
//            row = sheet.getRow(rowNum);
//            cell = row.getCell(colNum);
//
//            if(cell.getCellTypeEnum() == CellType.STRING)
//                return cell.getStringCellValue();
//            else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)
//            {
//                String cellValue = String.valueOf(cell.getNumericCellValue());
//                if(HSSFDateUtil.isCellDateFormatted(cell))
//                {
//                    DateFormat dt = new SimpleDateFormat("dd/mm/yy");
//                    Date date = cell.getDateCellValue();
//                    cellValue = dt.format(date);
//                }
//                return cellValue;
//            }else if(cell.getCellTypeEnum() == CellType.BLANK)
//                return "";
//            else
//                return String.valueOf(cell.getBooleanCellValue());
//        } catch (Exception e){
//            e.printStackTrace();
//            return "no matched value type";
//        }
//    }
//
//    public int getRowCount(String sheetName)
//    {
//        try {
//            sheet = workbook.getSheet(sheetName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        int rowCount = sheet.getLastRowNum()+1;
//        return rowCount;
//    }
//
//    public int getColumnCount(String sheetName)
//    {
//        try {
//            sheet = workbook.getSheet(sheetName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        row = sheet.getRow(0);
//        int colCount = row.getLastCellNum();
//        return colCount;
//    }
//
//    public Object[][] testData(String xFilePath, String sheetName) throws Exception
//    {
//        Object[][] execelData;
////        dp = new setUpCellData(xFilePath);
//
//        // find out how many rows and columns are in the excel sheet
//        int rows = getRowCount(sheetName);
//        int columns = getColumnCount(sheetName);
//
//        // place the defined row and column counts into data provider object(using rows-1 in order to skip header)
//        execelData = new Object[rows - 1][columns];
//        for(int r=1; r < rows; r++)
//        {
//            for(int c=0; c < columns; c++)
//            {
//                execelData[r-1][c] = getCellData(sheetName,r,c);
//            }
//        }
//
//        return execelData;
//
//    }

}
