package lottery.pk10;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class PK10 extends AbstractLottery {

	public PK10(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	/**
	*To test placing bet at 北京赛车(PK10) lottery 
	*@author Calvin Ong (Last Updated : Calvin Ong - 18-Jan-2018)
	*@since 18-Jan-2018
	*/
	public void Lottery_PK10(ExtentReports oReport, String sTestDesc) 
	{
		oTest = oReport.startTest("Lottery_PK10", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {
			System.out.println("Current location is : " + oDriver.getCurrentUrl());
//两面盘
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 两面盘 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//冠、亚军和 game
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//冠军 game
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 两面盘 > 冠、亚军和 & 冠军");

			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 两面盘 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			//亚军 game
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第三名 game
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 两面盘 > 亚军 & 第三名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 两面盘 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			//第四名 game
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第五名 game
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 两面盘 > 第四名 & 第五名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 两面盘 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			//第六名 game
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第七名 game
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第八名 game
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 两面盘 > 第六名, 第七名 & 第八名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 两面盘 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[1]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			//第九名 game
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			//第十名 game
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[11]/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 两面盘 > 第九名 & 第十名");
			
//单号1 - 10	
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//冠军 game                                    
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 冠军");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//亚军 game
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "亚军", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 亚军");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第三名 game                                    
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第三名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第三名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第四名 game                                    
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第四名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第四名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第五名 game                                    
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第五名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第五名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第六名 game                                    
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第六名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第六名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第七名 game                                    
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第七名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[7]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第七名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第八名 game                                    
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第八名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[8]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第八名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第九名 game                                    
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第九名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[9]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第九名");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 单号1 - 10 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[2]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//第十名 game                                    
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "第十名", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div[10]/div[2]/div/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 单号1 - 10 > 第十名");
			
//冠亚军组合	
			//initialize the parameter
			iA_TempValue = iMinBet;
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 冠亚军组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[3]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//冠、亚军和 game                                    
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[6]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[6]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[7]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[7]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[8]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[8]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[9]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[9]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[10]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[10]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[11]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[11]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[11]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[12]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[12]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[12]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[13]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[13]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[13]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[14]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[14]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[14]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[15]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[15]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[15]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 冠亚军组合 > 冠、亚军和");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 北京赛车(PK10) button to go to the PK10 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[4]")).click();
			
			//CLick on 冠亚军组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[3]")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//冠、亚军和 game                                    
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[16]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[16]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[16]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "冠亚军和", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[17]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[17]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div[17]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[3]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[3]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[4]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[4]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[5]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[5]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "北京赛车(PK10) > 冠亚军组合 > 冠、亚军和");
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

