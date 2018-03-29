package NewCreditFront;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Function_Lib {

	//please change the driver based on the driver used in Driver Script (C 3/3) (F 3/3)
	//WebDriver oDriver = new ChromeDriver();
	WebDriver oDriver = new FirefoxDriver();
	
	static String sA_TempValue;
	static String[] saTempArray;
	static InputStream inputStream;
	
	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : GetPropertyValues
	//Purpose     : To get values from a properties file
	//Author 	  : Calvin Ong 
	//Last Update : 29-Jan-2018
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////	
	public static String GetPropertyValues(String sGetValue) throws IOException
	{
		String sValueRetrieved = "";
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = Function_Lib.class.getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			// get the property value
			switch (sGetValue)
			{
				case "sTestResultFolderPath":
					sValueRetrieved = prop.getProperty("sTestResultFolderPath");
					break;
					
				case "sExtentReportConfigFilePath":
					sValueRetrieved = prop.getProperty("sExtentReportConfigFilePath");
					break;
					
				case "sTestDataPath":
					sValueRetrieved = prop.getProperty("sTestDataPath");
					break;
					
				case "sGeckoDriverPath":
					sValueRetrieved = prop.getProperty("sGeckoDriverPath");
					break;
					
				case "sChromeDriverPath":
					sValueRetrieved = prop.getProperty("sChromeDriverPath");
					break;
			}
 
		} catch (Exception e) {
			System.out.println("Exception: " + e.getStackTrace());
		} finally {
			inputStream.close();
		}
		return sValueRetrieved;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : SetTestResultFolderPath
	//Purpose     : To set a path for a folder
	//Author 	  : Calvin Ong 
	//Last Update : 06-Sep-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////	
	public static String SetTestResultFolderPath() throws IOException
	{
		String sTestResultFolderPath;
		
		//To get current date&time for report naming
		DateFormat dateFormat = new SimpleDateFormat("ddMMMyy_HHmmss");
		Date date = new Date();
		
		//sTestResultFolderPath = "C:\\Backup pendrive (28Aug)\\Automation Script\\Selenium\\2_TestResult\\NewCreditFront\\" + dateFormat.format(date);
		sTestResultFolderPath = Function_Lib.GetPropertyValues("sTestResultFolderPath") + dateFormat.format(date);
		
		return sTestResultFolderPath;
	}

	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : CreateFolder
	//Purpose     : To create a folder for test report and its screenshots
	//Author 	  : Calvin Ong 
	//Last Update : 31-Aug-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////	
	public static void CreateTestResultFolder(String sTestResultFolderPath)
	{
		new File(sTestResultFolderPath).mkdir(); 
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : WriteTestReport
	//Purpose     : To generate test report 
	//Author 	  : Calvin Ong 
	//Last Update : 06-Sep-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////
	public static ExtentReports WriteTestReport(String sModule, String sTestResultFolderPath) throws IOException
	{
		//To get current date&time for report naming
		DateFormat dateFormat = new SimpleDateFormat("ddMMMyy_HHmmss");
		Date date = new Date();
		
		//ExtentReport code
		ExtentReports extent;
		String Path = sTestResultFolderPath + "\\Automated Test Report-" + sModule + "_" + dateFormat.format(date) + ".html";
		
		extent = new ExtentReports(Path, false);
		//extent.loadConfig(new File("C:\\Backup pendrive (28Aug)\\Automation Script\\Selenium\\2_TestResult\\NewCreditFront\\ExtentReportConfig_NewCreditFront.xml"));
		extent.loadConfig(new File(Function_Lib.GetPropertyValues("sExtentReportConfigFilePath")));
		return extent;
	}
		
	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : CaptureScreen
	//Purpose     : To produce test report 
	//Author 	  : Calvin Ong 
	//Last Update : 06-Sep-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////	
	public static String CaptureScreen(WebDriver oDriver, String sTestResultFolderPath)
	{
		//To get current date&time for report naming
		DateFormat dateFormat = new SimpleDateFormat("ddMMMyy_HHmmss");
		Date date = new Date();
		
		String sImagePath = sTestResultFolderPath + "\\" + dateFormat.format(date);
		
		//ExtentReport code
		TakesScreenshot oScn = (TakesScreenshot) oDriver;
		File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
		File oDest = new File(sImagePath +".jpg");
		try {
			FileUtils.copyFile(oScnShot, oDest);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return sImagePath +".jpg";
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : ReadExcel
	//Purpose     : To read test data from excel file 
	//Author 	  : Calvin Ong 
	//Last Update : 06-Sep-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////	
	public static String[] ReadExcel(String sTestDataPath, String sSheetName) throws IOException, BiffException 
	{
		String[] aMyList;
		String sTempList;
		int iTotalNoOfRows;
		
		FileInputStream oFIS = new FileInputStream(sTestDataPath);
		Workbook oWB = Workbook.getWorkbook(oFIS);
		
		// TO get the access to the sheet
		Sheet oSH = oWB.getSheet(sSheetName);
		
		// To get the number of rows present in sheet
		iTotalNoOfRows = oSH.getRows();
		
		// To get the number of columns present in sheet
		//iTotalNoOfCols = oSH.getColumns();
		
		aMyList = new String[iTotalNoOfRows];
		
		for (int row = 0; row < iTotalNoOfRows; row++) 
		{
			sTempList = "";
			sTempList = oSH.getCell(0, row).getContents();
			aMyList[row] = sTempList;
		}
		return aMyList;
	}

	///////////////////////////////////////////////////////////////////////////////////
	//Method Name : MatchAndGetData
	//Purpose     : To get test data from excel file if match with the given value
	//Author 	  : Calvin Ong 
	//Last Update : 06-Sep-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////	
	public static String[] MatchAndGetData(String[] saSourceArray, String sValue) throws IOException, BiffException 
	{
		int c;
		String[] saDestinationArray = null;
		
		//loop the array, saWholeSetTD = Function_Lib.ReadExcel(sTestDataPath, sTestDataSheet);
		for (String sY : saSourceArray)
		{
			//retrieve the data from array if the first 4 char is matched with the value 
			if (sY.substring(0,4).equals(sValue))
			{
				//set the size of the array
				saDestinationArray = new String [sY.split(";").length];
				c = 0;
				
				for (String sZ : sY.split(";"))
				{
					//assign to local array	
					saDestinationArray[c] = sZ.toString();
					c++;
				}
				/*System.out.println(saDestinationArray[0]);
				System.out.println(saDestinationArray[1]);
				System.out.println(saDestinationArray[2]);*/
			}
		}
		
		return saDestinationArray;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : mouseHoverAndClickOnMenu
	//Purpose     : To be used when need to click on the mouse hover's menu
	//Author 	  : Calvin Ong 
	//Last Update : 04-Dec-2017
	//Updated by  : Calvin Ong
	//////////////////////////////////////////////////////////////////////////////////////////
	public static void mouseHoverAndClickOnMenu(WebDriver oDriver, String sXpathElementToHover, String sXpathElementToClick) throws InterruptedException {
		// move the mouse to the targeted element
		mouseHoverJScript(oDriver, sXpathElementToHover);

		//wait for 3 seconds before proceeding. This allows sub menu appears properly before trying to click on it
		Thread.sleep(3000);
		
		//identify menu option from the resulting menu display and click
		oDriver.findElement(By.linkText(sXpathElementToClick)).click();
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : selectComboboxValue
	//Purpose     : To be used when need to select value in the combobox
	//Author 	  : Calvin Ong 
	//Last Update : 27-Sep-2017
	//Updated by  : Calvin Ong
	//////////////////////////////////////////////////////////////////////////////////////////
	public static void selectComboboxValue(WebDriver oDriver, String sSearchBy, String sNameOfCombobox, String sValueToSelect)
	{
		if (sSearchBy == "by name")
		{
			Select combobox = new Select(oDriver.findElement(By.name(sNameOfCombobox)));
			combobox.selectByVisibleText(sValueToSelect);
		}
		else if (sSearchBy == "by class")
		{
			Select combobox = new Select(oDriver.findElement(By.className(sNameOfCombobox)));
			combobox.selectByVisibleText(sValueToSelect);
		}	
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : waitTime
	//Purpose     : To be used when there is element takes more time to load
	//Author 	  : Calvin Ong 
	//Last Update : 06-Sep-2017
	//Updated by  : Calvin Ong
	//////////////////////////////////////////////////////////////////////////////////////////
	public static void waitTime_Sec(int sWaitTime_Seconds) {
		String sResult = "false";
		String sTimeSet, sCurTime;
		
		//set the date format
		DateFormat oDF = new SimpleDateFormat("HH:mm:ss");
		//create Calendar instance
		Calendar oCal = Calendar.getInstance();
		//add time into the current time
		oCal.add(Calendar.SECOND, sWaitTime_Seconds);
		//set the current date time (with added time) to the format set in oDF
		sTimeSet = oDF.format(oCal.getTime());
		//initiate the Date variable
		Date dNow;
		
		do
		{
			dNow = new Date( );
			sCurTime = oDF.format(dNow.getTime());
					
			if (sTimeSet.equals(sCurTime))
			{
				sResult = "true";
				//System.out.println (sTimeSet + " vs " + sCurTime + ", " + sResult + ", " + sTimeSet.equals(sCurTime));
			}
		}while (sResult == "false");
	}

///////////////////////////////////////////////////////////////////////////////////////////////mouseHoverJScript-start	
	///////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : mouseHoverJScript
	//Purpose     : To be used when need to click on the mouse hover's menu
	//Author 	  : Calvin Ong 
	//Last Update : 04-Dec-2017
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////////////
	public static void mouseHoverJScript(WebDriver oDriver, String sHoverElementID) {
	
		try {
			WebElement wHoverElement = oDriver.findElement(By.id(sHoverElementID));
			
			if (isElementPresent(wHoverElement)) {
				String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', "
						+ "true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
				((JavascriptExecutor)oDriver).executeScript(mouseOverScript, wHoverElement);				
			} else {
				System.out.println("Element was not visible to hover " + "\n");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + sHoverElementID
					+ "is not attached to the page document"
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + sHoverElementID + " was not found in DOM"
					+ e.getStackTrace());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error occurred while hovering" + e.getStackTrace());
		}
	}

	public static boolean isElementPresent(WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed() || element.isEnabled()){
				flag = true;
			}	
		} catch (NoSuchElementException e) {
			flag = false;
		} catch (StaleElementReferenceException e) {
			flag = false;
		}
		return flag;
	}
///////////////////////////////////////////////////////////////////////////////////////////////mouseHoverJScript--end
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : scrollJScript
	//Purpose     : To be used when need to scroll the browser
	//Author 	  : Calvin Ong 
	//Last Update : 22-Jan-2018
	//Updated by  : Calvin Ong
	///////////////////////////////////////////////////////////////////////////////////////////
	public static void scrollJScript(WebDriver oDriver, String sScrollToElementXpath) {
	
		try 
		{
			/*JavascriptExecutor jsEx = (JavascriptExecutor) oDriver;
			jsEx.executeScript("window.scrollBy(0,250)", "");
			*/
			
			WebElement wScrollToElementXpath = oDriver.findElement(By.xpath(sScrollToElementXpath));
			((JavascriptExecutor) oDriver).executeScript("arguments[0].scrollIntoView(true);", wScrollToElementXpath);
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error occurred while scrolling browser" + e.getStackTrace());
			
		}			
	}

///////////////////////////////////////////////////////////////////////////////////////////////about Close Draw & Result Open 's remaining time - Start
	///////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : checkTimeInSec_CloseDraw
	//Purpose     : To be used to check the time left of CloseDraw
	//Author 	  : Calvin Ong 
	//Last Update : 17-Jan-2018
	//Updated by  : Calvin Ong
	//////////////////////////////////////////////////////////////////////////////////////////
	public static Integer checkTimeInSec_CloseDraw (WebDriver oDriver){
		Integer iTime = 0;
		
		//get the remaining time of close draw in text
		sA_TempValue = oDriver.findElement(By.xpath("//*[@id='main']/div[1]/div[1]/div[2]/div[2]/span")).getAttribute("innerText");
		saTempArray = sA_TempValue.split(":");
		iTime = (Integer.parseInt(saTempArray[0])*60 )+ iTime ;
		iTime = Integer.parseInt(saTempArray[1])+ iTime ;
		
		saTempArray = null;
		sA_TempValue = null;
		return iTime;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : checkTimeInSec_ResultOpen
	//Purpose     : To be used to check the time left of ResultOpen
	//Author 	  : Calvin Ong 
	//Last Update : 17-Jan-2018
	//Updated by  : Calvin Ong
	//////////////////////////////////////////////////////////////////////////////////////////
	public static Integer checkTimeInSec_ResultOpen (WebDriver oDriver){
		Integer iTime = 0;
		
		//get the remaining time of result open in text
		sA_TempValue = oDriver.findElement(By.xpath("//*[@id='main']/div[1]/div[1]/div[2]/div[3]/span")).getAttribute("innerText");
		saTempArray = sA_TempValue.split(":");
		iTime = (Integer.parseInt(saTempArray[0])*60 )+ iTime ;
		iTime = Integer.parseInt(saTempArray[1])+ iTime ;
		
		saTempArray = null;
		sA_TempValue = null;
		return iTime;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//Method Name : stopBettingIfOpenDrawTimeLessThanSec
	//Purpose     : To be used to wait if the draw time is less than the time provided
	//Author 	  : Calvin Ong 
	//Last Update : 26-Feb-2018
	//Updated by  : Calvin Ong
	//////////////////////////////////////////////////////////////////////////////////////////
	public static void stopBettingIfOpenDrawTimeLessThanSec (Integer iCloseDraw, Integer iResultOpen){
		try {
			if (iCloseDraw <= 20 && iCloseDraw > 0)
			{
				//*1000 due to converting it into milliseconds
				iResultOpen = (iResultOpen + 20) * 1000; 
				//wait until the next draw open
				Thread.sleep(iResultOpen);
			}
			else if (iCloseDraw == 0)
			{
				//*1000 due to converting it into milliseconds
				iResultOpen = (iResultOpen + 10) * 1000; 
				//wait until the next draw open
				Thread.sleep(iResultOpen);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("stopBettingIfOpenDrawTimeLessThanSec : " + e.getStackTrace());
		}
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////about Close Draw & Result Open 's remaining time - End
	
}
