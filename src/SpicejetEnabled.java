import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpicejetEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("enabled");
		Assert.assertTrue(true);
		}
		
		else
		{
			System.out.println("Disabled");
			Assert.assertTrue(false);
		}
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

	}

}
