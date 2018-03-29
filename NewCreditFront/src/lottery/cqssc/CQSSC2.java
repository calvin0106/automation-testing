package lottery.cqssc;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CQSSC2 extends AbstractLottery {
	
	public CQSSC2(WebDriver driver) {
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
		oTest = oReport.startTest("Lottery_CQSSC2", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {
//二字组合			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字前三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字前三
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字前三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字前三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字前三
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字前三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字中三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));

			//二字中三
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字中三");
			
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字中三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字中三
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字中三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字中三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字中三
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字中三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字中三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字中三
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字中三");
			
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字中三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字中三
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字中三");
			
		
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));

			//二字后三
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字后三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字后三
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字后三");
			
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字后三
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字后三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字后三
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[34]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[35]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[36]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[37]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[38]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[39]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[40]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[41]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[42]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[43]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[44]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字后三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[4]")).click();
			
			//Click on 二字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//二字后三
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[45]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[46]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[47]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[48]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[49]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[50]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[51]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[52]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[53]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[54]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[55]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字后三");
			
				
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 三字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[5]")).click();
			
			//Click on 三字前三 button
			Thread.sleep(iWaitTime);      
			oDriver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));

			//三字前三
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[15]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[15]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[15]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 三字组合 > 三字前三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 三字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[5]")).click();
			
			//Click on 三字前三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//三字前三
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[16]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[16]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[16]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[17]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[17]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[17]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[18]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[18]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[18]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[19]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[19]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[19]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[20]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[20]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[20]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[21]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[21]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[21]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[22]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[22]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[22]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[23]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[23]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[23]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[24]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[24]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[24]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[25]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[25]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[25]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[26]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[26]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[26]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[27]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[27]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[27]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[28]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[28]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[28]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[29]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[29]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[29]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[30]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[30]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[30]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 三字组合 > 三字前三");
			
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


