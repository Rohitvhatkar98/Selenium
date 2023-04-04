package Generic;

import java.time.Duration;

public class BaseTest implements IConstant {
	public WebDriver driver;
@BeforeClass
	void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver= new ChormeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
		driver.get(URL);
	}
@AfterClass
void afterClass() {
	driver.close();

}
}
