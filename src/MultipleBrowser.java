import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Method method=new Method();
		method.Browser1();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		method.Browser2();
		//method.Browser3();
		driver.quit();
		
		
		
	}
}
