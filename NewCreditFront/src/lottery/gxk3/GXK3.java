package lottery.gxk3;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class GXK3 extends AbstractLottery {

	public GXK3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	/**
	*To test placing bet at 广西快3 lottery
	*@author Nicholas Lim (Last Updated : Nicholas Lim - 29-Jan-2018)
	*@since 29-Jan-2018
	*/
	public void Lottery_GXK3(ExtentReports oReport, String sTestDesc) 
	{
		oTest = oReport.startTest("Lottery_GXK3", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {
//大小骰宝
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 广西快3 button to go to the 广西快3 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[8]")).click();
			
			//CLick on 大小骰宝 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//围骰、全骰 game
			System.out.println(oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).getAttribute("innerText"));
			Method_PlaceBet(sA_TempValue, "围骰", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "围骰", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "围骰", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "围骰", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "围骰", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "围骰", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "广西快3 > 大小骰宝 > 围骰、全骰军");

			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 广西快3 button to go to the 广西快3 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[8]")).click();
			
			//CLick on 大小骰宝 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//点数 game
			System.out.println(oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).getAttribute("innerText"));
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "点数", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "广西快3 > 大小骰宝 > 点数");
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			
			//CLick on 广西快3 button to go to the 广西快3 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[8]")).click();
			
			//CLick on 大小骰宝 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//长牌 game
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++,iMode2);
			Method_PlaceBet(sA_TempValue, "长牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[15]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[15]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[15]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue,iMode2);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "广西快3 > 大小骰宝 > 长牌");
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 广西快3 button to go to the 广西快3 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[8]")).click();
			
			//CLick on 大小骰宝 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//短牌 game
			Method_PlaceBet(sA_TempValue, "短牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "短牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "短牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "短牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "短牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "短牌", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "广西快3 > 大小骰宝 > 短牌");
	
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


