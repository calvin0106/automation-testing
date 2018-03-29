package lottery.cqssc;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CQSSC6 extends AbstractLottery {
	
	public CQSSC6(WebDriver driver) {
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
		oTest = oReport.startTest("Lottery_CQSSC6", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {								
//三字组合
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
			
			//Click on 三字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//三字后三
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[166]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[166]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[166]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[167]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[167]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[167]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[168]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[168]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[168]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[169]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[169]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[169]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[170]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[170]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[170]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[171]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[171]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[171]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[172]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[172]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[172]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[173]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[173]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[173]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[174]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[174]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[174]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[175]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[175]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[175]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[176]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[176]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[176]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[177]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[177]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[177]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[178]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[178]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[178]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[179]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[179]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[179]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[180]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[180]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[180]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 三字组合 > 三字后三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 三字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[5]")).click();
			
			//Click on 三字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//三字后三
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[181]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[181]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[181]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[182]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[182]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[182]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[183]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[183]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[183]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[184]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[184]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[184]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[185]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[185]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[185]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[186]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[186]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[186]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[187]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[187]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[187]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[188]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[188]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[188]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[189]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[189]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[189]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[190]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[190]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[190]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[191]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[191]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[191]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[192]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[192]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[192]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[193]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[193]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[193]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[194]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[194]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[194]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[195]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[195]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[195]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 三字组合 > 三字后三");
			
			
			//initialize the parameter
			iB_TempValue = 0;
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 三字组合 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[5]")).click();
			
			//Click on 三字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//三字后三
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[196]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[196]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[196]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[197]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[197]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[197]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[198]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[198]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[198]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[199]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[199]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[199]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[200]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[200]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[200]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[201]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[201]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[201]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[202]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[202]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[202]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[203]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[203]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[203]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[204]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[204]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[204]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[205]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[205]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[205]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[206]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[206]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[206]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[207]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[207]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[207]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[208]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[208]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[208]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[209]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[209]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[209]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[210]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[210]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[210]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 三字组合 > 三字后三");
			
			
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
			
			//Click on 三字后三 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//三字后三
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[211]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[211]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[211]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[212]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[212]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[212]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[213]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[213]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[213]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[214]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[214]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[214]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[215]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[215]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[215]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[216]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[216]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[216]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[217]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[217]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[217]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[218]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[218]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[218]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[219]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[219]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[219]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue++, iMode1);
			Method_PlaceBet(sA_TempValue, "三字后三", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[220]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[220]/div[2]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[220]/div[3]/input", iA_TempValue++, saTempArray, iB_TempValue, iMode1);
			FunctionLib.scrollJScript(oDriver, "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[2]/button[1]");
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord(saTempArray, iB_TempValue, "重庆时时彩 > 三字组合 > 三字后三");


//二字定位 - 万千
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
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[4]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[6]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[8]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[9]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万千 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[1]/a")).click();
			
			//Click on 万千位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万千
			Method_PlaceBetForDingWei(sA_TempValue, "万千定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[10]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万千 > 万千位快选");
			
			
//二字定位 - 万佰
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
			
			//Click on 万佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			//Click on 万佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万佰
			Method_PlaceBetForDingWei(sA_TempValue, "万佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万佰 > 万佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			//Click on 万佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万佰
			Method_PlaceBetForDingWei(sA_TempValue, "万佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万佰 > 万佰位快选");
			
			
			//initialize the parameter
			saTempArray = new String[15];
			//CLick on 重庆时时彩 button to go to the 重庆时时彩 lottery page
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='side-panel']/div[2]/div[3]/a[5]")).click();
			
			//CLick on 二字定位 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[1]/div[2]/a[6]")).click();
			
			//Click on 万佰 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
			
			//Click on 万佰位快选 button
			Thread.sleep(iWaitTime);
			oDriver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/ul/li[1]/a")).click();
			
			FunctionLib.stopBettingIfOpenDrawTimeLessThanSec(FunctionLib.checkTimeInSec_CloseDraw(oDriver), FunctionLib.checkTimeInSec_ResultOpen(oDriver));
			
			//万佰
			Method_PlaceBetForDingWei(sA_TempValue, "万佰定位复式1组", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/span", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input", "//*[@id='main']/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/span", "//*[@id='main']/div[2]/div/div[1]/div[3]/form/div[1]/span[1]/label/input", iA_TempValue, saTempArray);
			Method_SubmitBet();
			Method_VerifyUnsettledBetRecord_DingWei(saTempArray, iB_TempValue, "重庆时时彩 > 二字定位 > 万佰 > 万佰位快选");

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


