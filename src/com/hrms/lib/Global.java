package com.hrms.lib;
import org.openqa.selenium.WebDriver;


public class Global {
	
	public WebDriver driver;
	//First we take Input Data and Objects
	// input data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pswd  ="nareshit";
	public String ln = "Bhutad";
	public String fn = "Laxmikant";
	public String efn = "Selenium";
	public String eln = "Suresh";
	
	//object data
	public String txt_loginName = "txtUserName";
	public String txt_Password = "txtPassword";
	public String login_btn = "Submit";
	public String frm ="rightMenu";
	public String add_btn = "//input[@value='Add'][@class='plainbtn']";
	public String lastName = "txtEmpLastName";
	public String firstName = "txtEmpFirstName";
	public String save_btn = "btnEdit";
	public String link_path = "//*[@id='standardView']/table/tbody/tr[1]/td[3]/a";
	public String edit_btn = "EditMain";
	
	
	public String save ="EditMain";
	
	public String logout_link = "Logout";

}
//*[@id="standardView"]/table/tbody/tr[1]/td[3]/a