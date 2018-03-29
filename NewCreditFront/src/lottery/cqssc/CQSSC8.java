package lottery.cqssc;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CQSSC8 extends AbstractLottery {
	
	public CQSSC8(WebDriver driver) {
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
		oTest = oReport.startTest("Lottery_CQSSC8", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {												
//二字定位 - 万个			
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
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万个 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
			
			//Click on 万个位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万个
			Method_PlaceBetForDingWei(sA_TempValue, "万个定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万个 > 万个位快选");
			
			
//二字定位 - 千佰		
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
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 千佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[5]/a")).click();
			
			//Click on 千佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//千佰
			Method_PlaceBetForDingWei(sA_TempValue, "千佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 千佰 > 千佰位快选");
			
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


