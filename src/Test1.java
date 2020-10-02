import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https:\\www.salesforce.com");
				driver.findElement(By.linkText("Login")).click();
				//driver.findElement(By.id("username")).sendKeys("Prerna");
				driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Ravi");
				driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Ravi");
				driver.findElement(By.linkText("Try for Free")).click();
				/*driver.findElement(By.xpath("//input[@id='UserFirstName-XNCQ']")).sendKeys("Ravya");
				driver.findElement(By.xpath("//*[@id='UserLastName-57BD']")).sendKeys("jada");
				driver.findElement(By.cssSelector("div.dde-reason")).sendKeys("a@gmail.com");*/
				
				
				//driver.findElement(By.name("pw")).sendKeys("Prerna");
				//driver.findElement(By.id("Login")).click();
				//System.out.println(driver.findElement(By.id("error")).getText());
				//driver.findElement(By.partialLinkText("Forgot Your Password?")).click();
				//driver.findElement(By.name("un")).sendKeys("Prernaa");
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				//driver.close();
				
	}

}
