package lottery.cqssc;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CQSSC extends AbstractLottery {
	
	public CQSSC(WebDriver driver) {
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
		oTest = oReport.startTest("Lottery_CQSSC", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {
//两面
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.cssSelector("div.side-panel-favourite-menu.k1_k7 > a:nth-child(6)")).click();
			
			//CLick on 两面 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.cssSelector("div.o3_op > a.o3_lk.o3_cs.active.game-style-list")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
		
			//总和-龙虎和 game
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第一球
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第二球
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue - 1, "重庆时时彩 > 两面 > 总和-龙虎和 & 第一球 & 第二球");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 两面 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			//第三球
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第四球
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第五球
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 两面 > 第三球 & 第四球 & 第五球");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 两面 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//前三
			Method_PlaceBet(sA_TempValue, "前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//中三
			Method_PlaceBet(sA_TempValue, "中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//后三
			Method_PlaceBet(sA_TempValue, "后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 两面 > 前三 & 中三 & 后三");
			
//1~5			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 1~5 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第一球
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第一球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[5]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 1~5 > 第一球");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 1~5 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第二球
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);

			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第二球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 1~5 > 第二球");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 1~5 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第三球
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 1~5 > 第三球");			
			
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 1~5 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第四球
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 1~5 > 第四球");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 1~5 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第五球
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五球", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 1~5 > 第五球");			
			
//一字组合			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 一字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[3]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//一字组合(前三)
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 一字组合 > 一字组合(前三)");
			
			
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 一字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[3]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//一字组合(中三)
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字中三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 一字组合 > 一字组合(中三)");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 一字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[3]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//一字组合(后三)
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 一字组合 > 一字组合(后三)");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 一字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[3]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//一字组合(全五)
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "一字全五", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 一字组合 > 一字组合(全五)");
			
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
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
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
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[15]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[16]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[17]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[18]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[19]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[20]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[21]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[22]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
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
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[23]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[24]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[25]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[26]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[27]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[28]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[29]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[30]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[31]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[32]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "二字前三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[33]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 二字组合 > 二字前三");
		
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

