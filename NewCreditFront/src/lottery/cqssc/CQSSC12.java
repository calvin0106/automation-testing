package lottery.cqssc;

import NewCreditFront.AbstractLottery;
import NewCreditFront.FunctionLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CQSSC12 extends AbstractLottery {
	
	public CQSSC12(WebDriver driver) {
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
		oTest = oReport.startTest("Lottery_CQSSC12", sTestDesc);
		Integer iMinBet = 2;
		sA_TempValue = "//*[@id='main']/div[1]/div[1]/div[2]/div[1]/span";
		
		try {																		

//二字定位 - 选项快选 -- 万千, 万佰, 万拾, 万个, 千佰, 千拾, 千个, 佰拾, 佰个, 拾个 - on hold due to high complexity
		
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


