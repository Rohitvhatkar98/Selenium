package pom;

public class LoginPage {
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy (id="username")
	private WebElement username;
	@FindBy (name ="pwd")
	private WebElement password;
	@FindBy (xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBTN() {
		retun loginBTN;
		
}
}
