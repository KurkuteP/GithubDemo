import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'log')]")).sendKeys("Prerna");
		driver.findElement(By.name("passwd")).sendKeys("Peru");;
		driver.findElement(By.xpath("//input[contains(@title,'Sign in')]")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.navigate().back();
		//driver.findElement(By.linkText("Create new Rediffmail account")).click();
		//System.out.println();
		driver.close();
		/*driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Prerna");
		/*driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Prerna");;
		driver.findElement(By.xpath("//*[@id='u_c_d']")).sendKeys("Kurkute");;
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("prerna@gmail.com");
		driver.findElement(By.xpath("//*[@data-type='password']")).sendKeys("prerna");
		*/
		
		//driver.findElement(((WebElement) By.id("u_0_2")).click();
	  }

}
