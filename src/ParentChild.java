import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.globalglaze.in");
		driver.findElement(By.xpath("//form[@name='aspnetForm']/div[2]/div[3]/div/div/div/input")).sendKeys("Prerna");
		driver.findElement(By.xpath("//form[@name='aspnetForm']/div[2]/div[3]/div/div/div/div/input")).sendKeys("Ravi");
	    driver.findElement(By.xpath("//button[@title='Show Password']")).click();
	    driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	    
	    //Traverse from child to parent if parent attributes is dynamic
		//driver.findElement(By.xpath("//*[@id='adminpassword']/parent::div")).sendKeys("Ravi");
	}

}
