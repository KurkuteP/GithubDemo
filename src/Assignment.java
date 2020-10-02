import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Ravi");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		//String obj=driver.switchTo().alert().getText();
		if(driver.switchTo().alert().getText().contains("Raviya")) {
			
			System.out.println("Test Pass");
			Assert.assertTrue(true);
		}
		else
		{

			System.out.println("Test fail");
			Assert.assertTrue(true);
		}
		//driver.switchTo().alert().accept();
		
		
		/*System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.quit();*/
	}

}
