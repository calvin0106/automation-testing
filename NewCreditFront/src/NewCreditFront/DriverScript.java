package NewCreditFront;

import lottery.cqssc.*;
import lottery.gxk3.GXK3;
import lottery.pk10.PK10;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverScript {

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
		sTestDataPath = FunctionLib.GetPropertyValues("sTestDataPath");
		
		//Set a path for test result folder
		sTestResultFolderPath = FunctionLib.SetTestResultFolderPath();
		//Create a folder
		FunctionLib.CreateTestResultFolder(sTestResultFolderPath);
		//Initiate ExtentReport
		oReport = FunctionLib.WriteTestReport("New Credit Frontend", sTestResultFolderPath);
/*		
		//**********************************************Chrome Browser*************************************************
		//initialize browser (C 1/2)
		System.setProperty("webdriver.chrome.driver", FunctionLib.GetPropertyValues("sChromeDriverPath"));
		WebDriver oDriver = new ChromeDriver();
*/		//**********************************************Chrome Browser*************************************************
		
		//**********************************************Firefox Browser*************************************************
		//initialize browser (F 1/2)
		System.setProperty("webdriver.gecko.driver", FunctionLib.GetPropertyValues("sGeckoDriverPath"));
		oDriver = new FirefoxDriver();
		//**********************************************Firefox Browser*************************************************

		CreditFrontEndLogin creditlogin = new CreditFrontEndLogin(oDriver);
		PK10 pk10 = new PK10(oDriver);//
		CQSSC cqssc = new CQSSC(oDriver);
		CQSSC2 cqssc2 = new CQSSC2(oDriver);
		CQSSC3 cqssc3 = new CQSSC3(oDriver);
		CQSSC4 cqssc4 = new CQSSC4(oDriver);
		CQSSC5 cqssc5 = new CQSSC5(oDriver);
		CQSSC6 cqssc6 = new CQSSC6(oDriver);
		CQSSC7 cqssc7 = new CQSSC7(oDriver);
		CQSSC8 cqssc8 = new CQSSC8(oDriver);
		CQSSC9 cqssc9 = new CQSSC9(oDriver);
		CQSSC10 cqssc10 = new CQSSC10(oDriver);
		CQSSC11 cqssc11 = new CQSSC11(oDriver);
		CQSSC11 cqssc12 = new CQSSC11(oDriver);
		GXK3 gxk3 = new GXK3(oDriver);

		//Set the timeout = 5 second
		oDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		//retrieve whole set of test data from excel and put into array saWholeSetTD
		saWholeSetTD = FunctionLib.ReadExcel(sTestDataPath, sTestDataSheet);

		//*********************************************Methods from Application_Lib.java************************************			
		saFilteredTD = FunctionLib.MatchAndGetData(saWholeSetTD, "A001");
		creditlogin.Frontend_login (oReport, "Login as member to "+ saFilteredTD[1], saFilteredTD[1], saFilteredTD[2], saFilteredTD[3]);
		pk10.Lottery_PK10(oReport, "Verify that all games in 北京赛车(PK10) lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc2.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc3.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc4.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc5.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc6.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc7.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc8.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc9.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc10.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		cqssc11.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		//cqssc12.Lottery_CQSSC(oReport, "Verify that all games in 重庆时时彩 lottery are able to bet and bet record reflects in 未结明细 correctly.");
		gxk3.Lottery_GXK3(oReport, "Verify that all games in 广西快3 lottery are able to bet and bet record reflects in 未结明细 correctly.");

		//*********************************************Methods from Application_Lib.java************************************		
		
		//Close the browser and close the webdriver & ExtentReport
		oReport.close();
		oDriver.close();
		oDriver.quit();
	}

}

