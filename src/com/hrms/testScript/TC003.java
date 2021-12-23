package com.hrms.testScript;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;

public class TC003 {
	
	//public static void main(String args[]) throws Exception
	@Test
	public void tc003() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General gen = new General();
		
		gen.openApplication();
		Thread.sleep(3000);
		
		gen.login();
		
		gen.enterFrame();
		gen.editEmp();
		Thread.sleep(3000);
		
		gen.exitFrame();
		
		gen.logout();
		Thread.sleep(3000);
		
		gen.closeBrowser();
	}
	

}
