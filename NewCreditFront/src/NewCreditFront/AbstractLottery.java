package NewCreditFront;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class AbstractLottery {
	
	public WebDriver oDriver;
	protected ExtentReports oReport;
	protected ExtentTest oTest;
	protected Integer iWaitTime = 1000; //wait time = 3 seconds (3000ms)
	protected String sTestResultFolderPath = DriverScript.sTestResultFolderPath;
	protected Integer iA_TempValue;
	protected Integer iB_TempValue;
	protected Integer iC_TempValue;
	protected String sA_TempValue;
	protected String sB_TempValue;
	protected String sC_TempValue;
	protected String[] saTempArray;
	protected Integer iMode1 =1;
	protected Integer iMode2 =2;
	protected Integer iMode3 =3;
	protected Integer iMode4 =4;
	protected Integer iMode5 =5;
	protected Integer iMode6 =6;
	
	public AbstractLottery(WebDriver driver) {
		this.oDriver = driver;
	}

	
	/**
	*To place bet into game and store bet info into array
	*@author Calvin Ong (Last Updated : Nicholas Lim - 8-Mar-2018)
	*@since 26-Feb-2018
	*/
	protected void Method_PlaceBet(String sLotteryPeriodId, String sGameTypePrefix, String sGameTypeXpath, String sGameOddsXpath, String sGameBetFieldXpath, Integer iBetAmount, String[] saTempArr, Integer iArrayIndex, Integer iMode) 
	{
		String sDice;
		String [] saDiceArray;
		String sTwo;
		
		try {
			//insert bet amount
			oDriver.findElement(By.xpath(sGameBetFieldXpath)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			oDriver.findElement(By.xpath(sGameBetFieldXpath)).sendKeys(iBetAmount.toString());
			
			switch (iMode)
			{
				case 1:
				{
					//Concatenate lottery period id + game type + game odds + the bet amount
					saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + oDriver.findElement(By.xpath(sGameTypeXpath)).getAttribute("innerText") + "@" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") + "::" + iBetAmount.toString();
				}
				break;
				
				case 2:
				{
					sTwo = (oDriver.findElement(By.xpath(sGameTypeXpath)).getAttribute("innerText")).substring(0, 2);
					//Concatenate lottery period id + game type + sTwo + game odds + the bet amount
					saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + sTwo + "@" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") + "::" + iBetAmount.toString();
				}
				break;
				
				case 3:
				{
					//Get 3 dices value without ","
					saDiceArray= (oDriver.findElement(By.xpath(sGameTypeXpath)).getAttribute("innerText")).split(",");
					sDice= saDiceArray[0] + saDiceArray[1] +saDiceArray[2];
					//Concatenate lottery period id + game type + game odds + the bet amount
					saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + sDice + "@" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") + "::" + iBetAmount.toString();
				}	
			    break;
			    
				case 4:
				{
					//Hard coded for GameType + GameOdd
					//Concatenate lottery period id + game type + game odds + the bet amount
					saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + oDriver.findElement(By.xpath(sGameTypeXpath)).getAttribute("innerText") + "@å¼€2éª°@å¼€3éª°" + "@" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") +",2.9855,3.9855" + "::" + iBetAmount.toString();
				}
				break;
				
				case 5:
				{
					//Hard coded for GameType + GameOdd for é±¼è™¾èŸ¹è‚¡å®�
					//Game Type fully hard code
					//Concatenate lottery period id + game type + game odds + the bet amount
					saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + sGameTypeXpath + "@å¼€2éª°@å¼€3éª°" + "@" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") +",2.9855,3.9855" + "::" + iBetAmount.toString();
				}
				break;
				
				case 6:
				{
					//Hard coded for game type prefix
					//Concatenate lottery period id + game type + game odds + the bet amount
					saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + sGameTypeXpath + "@" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") + "::" + iBetAmount.toString();
				}
				break;
			}
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
		
		sDice = null;
		saDiceArray = null;
		sTwo = null;
	}
	
	
	/**
	*To place bet into 定位 game and store bet info into array
	*@author Calvin Ong (Last Updated : Calvin Ong - 26-Feb-2018)
	*@since 26-Feb-2018
	*/
	protected void Method_PlaceBetForDingWei(String sLotteryPeriodId, String sGameTypePrefix, String sFirstNumXpath, String sFirstNumCheckBoxXpath, String sGameOddsXpath, String sGameBetFieldXpath, Integer iBetAmount, String[] saTempArr)
	{
		Integer iArrayIndex;
		Integer iCount = 0;
		
		try {
			//Tick on the checkbox for the first number
			oDriver.findElement(By.xpath(sFirstNumCheckBoxXpath)).click();
			
			//Tick on the checkbox for the second numbers (10 numbers)
			for (iArrayIndex=0; iArrayIndex < 10; iArrayIndex++)
			{
				iCount = iArrayIndex + 1;
				oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[2]/div[2]/div[" + iCount.toString() + "]/div[2]/input")).click();
				//Concatenate lottery period id + game type + game odds + the bet amount
				saTempArr[iArrayIndex] = oDriver.findElement(By.xpath(sLotteryPeriodId)).getAttribute("innerText") + "::" + sGameTypePrefix + "::" + oDriver.findElement(By.xpath(sFirstNumXpath)).getAttribute("innerText") + ","+ oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[2]/div[2]/div[" + iCount.toString() + "]/div[1]/span")).getAttribute("innerText") + "::" + oDriver.findElement(By.xpath(sGameOddsXpath)).getAttribute("innerText") + "::" + iBetAmount.toString();
			}
			//insert bet amount
			oDriver.findElement(By.xpath(sGameBetFieldXpath)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			oDriver.findElement(By.xpath(sGameBetFieldXpath)).sendKeys(iBetAmount.toString());
					
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
		
		iArrayIndex = null;
		iCount = null;
	}
	
	
	/**
	*To submit those placed bet
	*@author Calvin Ong (Last Updated : Calvin Ong - 18-Jan-2018)
	*@since 18-Jan-2018
	*/
	protected void Method_SubmitBet() 
	{
		try {
			Thread.sleep(iWaitTime);
			//Click on 确定 button
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]")).click();
			CheckPoint("1", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[2]/div[2]", "", "Verify that 下注明细（请确认注单） pop up window should appear.");
		
			//Click on 确定 button at 下注明细 pop up window
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[2]/div[2]/div[2]/button[1]")).click();
			CheckPoint("5", "swal-modal", "", "Verify that 下注成功  pop up window should appear.");
			
			//Click on 确定 button at 下注成功 pop up window
			oDriver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
	}
	

	/**
	*To Check bet record in 未结明细
	*@author Calvin Ong (Last Updated : Nicholas Lim - 8-Mar-2018)
	*@since 18-Jan-2018
	*/
	protected void Method_VerifyUnsettledBetRecord(String[] saTempArr, Integer iArrayIndex, String sGameName) 
	{
		String sResultFlag = "Passed";
		String[] saArray;
		String sResultDesc = "__";
		Integer iTotalRow = iArrayIndex;
		
		try {
			//Click on 未结明细 button
			oDriver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div/div[3]/div[1]/a[1]")).click();
			
			Thread.sleep(iWaitTime);
			
			for (Integer iCount=1; iCount<=iTotalRow +1; iCount++)
			{
				saArray = saTempArr[iArrayIndex].split("::");
				//verify 类型 , 玩法, 下注金额
				if (oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[3]")).getAttribute("innerText").indexOf(saArray[0]) != -1 && oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[4]")).getAttribute("innerText").replaceAll("[\\(\\)\\（\\）]", "").matches(saArray[1].replaceAll("[\\(\\)\\（\\）]", "")) && oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[6]")).getAttribute("innerText").matches(saArray[2]))
				{
					sResultDesc = sResultDesc + saTempArr[iArrayIndex] + "***";
				}
				else
				{
					sResultDesc = sResultDesc + saTempArr[iArrayIndex] + "(this bet record is incorrect.)";
					sResultFlag = "Failed";
					break;
				}
				iArrayIndex--;
			}
			
			CheckPoint("4", sResultFlag, "Passed", "Verify that" + sGameName + "displayed in 未结明细 are correct (Verify by using 类型 , 玩法, 下注金额)." + sResultDesc);
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
		
		saArray = null;
		sResultDesc = null;
	}
	

	/**
	*To Check bet record in 未结明细 for 定位 games
	*@author Calvin Ong (Last Updated : Calvin Ong - 18-Jan-2018)
	*@since 18-Jan-2018
	*/
	protected void Method_VerifyUnsettledBetRecord_DingWei(String[] saTempArr, Integer iArrayIndex, String sGameName) 
	{
		String sResultFlag = "Passed";
		String[] saArray;
		String sResultDesc = "__";
		Integer iTotalRow = iArrayIndex;
		
		try {
			//Click on 未结明细 button
			oDriver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div/div[3]/div[1]/a[1]")).click();
			
			Thread.sleep(iWaitTime);
			
			for (Integer iCount=1; iCount<=iTotalRow +1; iCount++)
			{
				saArray = saTempArr[iArrayIndex].split("::");
				//verify 类型 , 玩法, 下注金额
				if (oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[3]")).getAttribute("innerText").indexOf(saArray[0]) != -1 && (oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[4]/span[1]")).getAttribute("innerText") + oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[4]/span[2]")).getAttribute("innerText")).matches(saArray[1]) && oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[4]/span[3]")).getAttribute("innerText").matches(saArray[2]) && oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[4]/span[4]")).getAttribute("innerText").matches(saArray[3]) && oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/table/tbody/tr["+iCount+"]/td[6]")).getAttribute("innerText").matches(saArray[4]))
				{
					sResultDesc = sResultDesc + saTempArr[iArrayIndex] + "***";
				}
				else
				{
					sResultDesc = sResultDesc + saTempArr[iArrayIndex] + "(this bet record is incorrect.)";
					sResultFlag = "Failed";
					break;
				}
				iArrayIndex--;
			}
			
			CheckPoint("4", sResultFlag, "Passed", "Verify that" + sGameName + "displayed in 未结明细 are correct (Verify by using 类型 , 玩法, 下注金额)." + sResultDesc);
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
		
		saArray = null;
		sResultDesc = null;
	}
	
	
	/**
	*for 今天已结 
	*@author Calvin Ong (Last Updated : Calvin Ong - 7-Mar-2018)
	*@since 7-Mar-2018
	*/
	public void Template (ExtentReports oReport, String sTestDesc, String A, String B) 
	{
		oTest = oReport.startTest("Module 2", sTestDesc);
		
		try 
		{
			// for 今天已结 use
			ArrayList<String> list = new ArrayList<>();
			
			list.add("test"); // to add value in the list
			list.clear();  // to clear all value in the arraylist
			
			
			
		
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e);
		}
		
		//Ends and prepares the test to be added to the report 
		oReport.endTest(oTest);
		//Appends the HTML file with all the ended tests.
		oReport.flush();
	}
	
	
	/**
	*To provide result of validation into the test report  
	*@author Calvin Ong (Last Updated : Calvin Ong - 12-Dec-2017)
	*@since 12-Dec-2017
	*/
	protected void CheckPoint(String sCaseNum, String sXpathOrValue, String sValueToCompare, String sWhatToVerify) throws InterruptedException
	{
		switch (sCaseNum)
		{
		case "1": 
			//PASS if the element (search by xpath) can be found
			//FAIL if the element (search by xpath) cannot be found
			Thread.sleep(iWaitTime);
			if (oDriver.findElement(By.xpath(sXpathOrValue)).isDisplayed())
			{
				oTest.log(LogStatus.PASS, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			else
			{
				oTest.log(LogStatus.FAIL, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			break;
			
		case "2": 
			//PASS if the element (search by xpath) cannot be found
			//FAIL if the element (search by xpath) can be found
			Thread.sleep(iWaitTime);
			if (oDriver.findElement(By.xpath(sXpathOrValue)).isDisplayed())
			{
				oTest.log(LogStatus.FAIL, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			else
			{
				oTest.log(LogStatus.PASS, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			break;
			
		case "3": 
			//PASS if the value of element (search by xpath) contains given value
			//FAIL if the value of element (search by xpath) does not contain given value
			Thread.sleep(iWaitTime);
			if (sXpathOrValue.toLowerCase().indexOf(sValueToCompare.toLowerCase()) != -1)
			{
				oTest.log(LogStatus.PASS, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			else
			{
				oTest.log(LogStatus.FAIL, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			break;
			
		case "4": 
			//PASS if the value of element matches given value
			//FAIL if the value of element does not match given value
			Thread.sleep(iWaitTime);
			if (sXpathOrValue.toLowerCase().matches(sValueToCompare.toLowerCase()))
			{
				oTest.log(LogStatus.PASS, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			else
			{
				oTest.log(LogStatus.FAIL, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			break;
			
		case "5": 
			//PASS if the element (search by Class Name) can be found
			//FAIL if the element (search by Class Name) cannot be found
			Thread.sleep(iWaitTime);
			if (oDriver.findElement(By.className(sXpathOrValue)).isDisplayed())
			{
				oTest.log(LogStatus.PASS, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			else
			{
				oTest.log(LogStatus.FAIL, sWhatToVerify);
				oTest.addScreenCapture(FunctionLib.CaptureScreen(oDriver, sTestResultFolderPath));
			}
			break;
			
		default:
			oTest.log(LogStatus.FAIL, "Something Wrong. Please check......");
		}
	}
}
