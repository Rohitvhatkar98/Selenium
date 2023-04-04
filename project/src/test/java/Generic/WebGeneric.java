package Generic;

import java.util.Random;

public class WebGeneric extends BaseTest {
	public Void verifyTitle(String expectedTitle) {
		String actulaTitle= driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			Reporter.log("title verified",true);
		else
			Reporter.log("title not verified", true);
	}
public void verifyURL(String expectedURL) {
	String actulaTitle= driver.getCurrentUrl();
	if(actualTitle.equals(expectedURL))
		Reporter.log("title verified",true);
	else
		Reporter.log("title not verified", true);
}	
public int randomNumber() {
	Random r=new Random();
	return r.nextInt();
}
}


