package com.hrms.lib;

import com.hrms.utility.Log;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class General extends Global{
	
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Laxmikant\\Selenium\\CDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		 
		 System.out.println("Application Opened");
		 Reporter.log("Applicatopn Opened");
		 Log.info("Application Opened");
	}
	
	public void login() throws Exception
	{
		driver.findElement(By.name(txt_loginName)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pswd);
		driver.findElement(By.name(login_btn)).click();
		Thread.sleep(3000);
		System.out.println("Login Successful");
		 Log.info("Login Completed");
	}
	
	
	public void enterFrame()
	{
		driver.switchTo().frame(frm);
		System.out.println("Enter Into Frame");
	}
	
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit from Frame");
	}
	
	public void addEmp() throws Exception
	{
		
		driver.findElement(By.xpath(add_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(lastName)).sendKeys(ln);
		driver.findElement(By.name(firstName)).sendKeys(fn);
		driver.findElement(By.id(save_btn)).click();
		
		Thread.sleep(3000);
		System.out.println("Add Eployee Details Successfull");
		Log.info("Add Employee done");
	}
	
	public void editEmp() throws Exception
	{
		
		driver.findElement(By.xpath(link_path)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name(edit_btn)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name(lastName)).clear();
		driver.findElement(By.name(firstName)).clear();
		Thread.sleep(3000);
		driver.findElement(By.name(lastName)).sendKeys(eln);
		driver.findElement(By.name(firstName)).sendKeys(efn);
		
		/*driver.findElement(By.name(efName)).clear();
		driver.findElement(By.name(elName)).clear();
		driver.findElement(By.name(efName)).sendKeys(efn);
		driver.findElement(By.name(elName)).sendKeys(eln); */
		
		Thread.sleep(3000);
		driver.findElement(By.name(save)).click();
		Thread.sleep(3000);
		
		System.out.println("Edit done");
	}
	
	public void logout()
	{
		driver.findElement(By.linkText(logout_link)).click();
		System.out.println("Logout Successful");
		Log.info("Logout");
	}
	
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser Closed");
	}

}

//*[@id="standardView"]/table/tbody/tr[2]/td[3]/a
//*[@id="standardView"]/table/tbody/tr[2]/td[3]/a