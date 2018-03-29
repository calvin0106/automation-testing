package NewCreditFront;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CreditFrontEndLogin extends AbstractLottery {
	
	public CreditFrontEndLogin (WebDriver driver) {
		super(driver);
	}
	
	
	/**
	*To log in to front end 
	*@author Calvin Ong 
	*@since 7-Mar-2018
	*/
	public void Frontend_login(ExtentReports oReport, String sTestDesc, String sURL, String sMemberLogin, String sMemberPassword)
	{
		//browse to the urls
		oDriver.get(sURL);
		//Maximize the browser
		oDriver.manage().window().maximize();
		oTest = oReport.startTest("Frontend_login", sTestDesc);
		
		try 
		{
			Thread.sleep(iWaitTime);
			//Log in using correct username and password 
			oDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/form/div/div/div[1]/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			oDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/form/div/div/div[1]/div[2]/input")).sendKeys(sMemberLogin);
			oDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/form/div/div/div[2]/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			oDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/form/div/div/div[2]/div[2]/input")).sendKeys(sMemberPassword);
			oDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/form/div/div/div[4]/div/button")).click();
			Thread.sleep(iWaitTime); 
			//click on Agree button for T & C
			oDriver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/button[2]")).click();
			
			Thread.sleep(iWaitTime);
			CheckPoint("3", oDriver.findElement(By.xpath("//*[@id='main']/div[1]/div[1]/div[1]/div[1]/span[2]")).getAttribute("innerText"), sMemberLogin, "Verify that member (" + sMemberLogin + ") is able to login successfully.");
		
		} 
		catch (Exception e) 
		{
			oTest.log(LogStatus.FAIL, "Exception Thrown : " + e.getMessage(),e);
		}
		
		//Ends and prepares the test to be added to the report 
		oReport.endTest(oTest);
		//Appends the HTML file with all the ended tests.
		oReport.flush();
	}
}
