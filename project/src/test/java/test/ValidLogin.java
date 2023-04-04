package test;

import Generic.BaseTest;
import Generic.ReadExcel;
import pom.LoginPage;

public class ValidLogin extends BaseTest{
	@Test
	void validLogin() 
	LoginPage lp=new LoginPage(driver);
	ReadExcel excel =new ReadExcel();
	String username = excel.getData("Sheet1", 0, 0);
	String password = excel.getData("Sheet1", 0, 1);
	lp.getUsername().sendKeys(username);
	lp.getPassword().sendKeys(password);
	lp.getloginBTN().click();
	WebGeneric wg=new WEbGeneric();
	wg.verifyTitle("actiTime - Enter Time-Track");
	HomePage hp= new HomePage(driver);
	hp.getLogout().click();
	
}


