package com.hrms.testScript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

// Login and Logout
public class TC001 {
	
	//public static void main(String args[]) throws Exception
	@Test
	public void tc001() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General gen = new General();
		
		gen.openApplication();
		 Thread.sleep(3000);
		 
		 gen.login();
		 
		 gen.logout();
		 Thread.sleep(3000);
		 
		 gen.closeBrowser();
	}

}
