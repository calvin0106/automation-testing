package NewCreditFront;

import lottery.cqssc.CQSSC;
import lottery.pk10.PK10;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Driver_Script {

	static WebDriver oDriver;
	static String sTestDataPath;
	static String sTestDataSheet = "TestData";
	static ExtentReports oReport;
	static ExtentTest oTest;
	static String sTestResultFolderPath;
	static String[] saWholeSetTD;
	static String[] saFilteredTD;
	
	public static void main(String[] args) throws BiffException, IOException {
	
		
		//retrieve value from config file
		sTestDataPath = Function_Lib.GetPropertyValues("sTestDataPath");
		
		//Set a path for test result folder
		sTestResultFolderPath = Function_Lib.SetTestResultFolderPath();
		//Create a folder
		Function_Lib.CreateTestResultFolder(sTestResultFolderPath);
		//Initiate ExtentReport
		oReport = Function_Lib.WriteTestReport("New Credit Frontend", sTestResultFolderPath);
		
		/*		//**********************************************Chrome Browser*************************************************
		//initialize browser (C 1/3)
		System.setProperty("webdriver.chrome.driver", Function_Lib.GetPropertyValues("sChromeDriverPath"));
		WebDriver oDriver = new ChromeDriver();
*/		//**********************************************Chrome Browser*************************************************
		
		//**********************************************Firefox Browser*************************************************
		//initialize browser (F 1/3)
		System.setProperty("webdriver.gecko.driver", Function_Lib.GetPropertyValues("sGeckoDriverPath"));
		oDriver = new FirefoxDriver();
		//**********************************************Firefox Browser*************************************************

		CreditFrontEndLogin creditlogin = new CreditFrontEndLogin(oDriver);
		PK10 pk10 = new PK10(oDriver);
		CQSSC cqssc = new CQSSC(oDriver);

		//Set the timeout = 5 second
		oDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		//retrieve whole set of test data from excel and put into array saWholeSetTD
		saWholeSetTD = Function_Lib.ReadExcel(sTestDataPath, sTestDataSheet);

		//*********************************************Methods from Application_Lib.java************************************			
		saFilteredTD = Function_Lib.MatchAndGetData(saWholeSetTD, "A001");
		creditlogin.Frontend_login (oReport, "Login as member to "+ saFilteredTD[1], saFilteredTD[1], saFilteredTD[2], saFilteredTD[3]);
		//pk10.Lottery_PK10(oReport, "Verify that all games in 北京赛车(PK10) lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");

		//*********************************************Methods from Application_Lib.java************************************		
		
		//Close the browser and close the webdriver & ExtentReport
		oReport.close();
		oDriver.close();
		oDriver.quit();
	}

}

