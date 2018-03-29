package lottery.cqssc;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CQSSC9 extends AbstractLottery {
	
	public CQSSC9(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	*To test placing bet at 重庆时时彩 lottery
	*@author Calvin Ong (Last Updated : Calvin Ong - 7-Mar-2018)
	*@since 7-Mar-2018
	*/
	public void Lottery_CQSSC(ExtentReports oReport, String sTestDesc) 
	{
		oTest = oReport.startTest("Lottery_CQSSC9", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {														
//二字定位 - 千拾	
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 9; //10 values, use '9' instead of '10' due to array starts with '0'.
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千拾 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[6]/a")).click();
			
			//Click on 千拾位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千拾
			Method_PlaceBetForDingWei(sA_TempValue, "千拾定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千拾 > 千拾位快选");
			
			
//二字定位 - 千个	
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 9; //10 values, use '9' instead of '10' due to array starts with '0'.
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[7]/a")).click();
			
			//Click on 千个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千个
			Method_PlaceBetForDingWei(sA_TempValue, "千个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千个 > 千个位快选");

		}
		catch (Exception e)
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
		
		sA_TempValue = null;
		iA_TempValue = null;
		saTempArray = null;
		//Ends and prepares the test to be added to the report 
		oReport.endTest(oTest);
		//Appends the HTML file with all the ended tests.
		oReport.flush();
	}

}


