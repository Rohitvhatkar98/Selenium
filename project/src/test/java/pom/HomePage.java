package pom;

public class HomePage {
public HomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
 	@Friday(id="LogoutLink")
 	private WebElement logut;

 	public WebElement getLogout() {
	return logut;
}
}
