import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("login")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='row']/div/form/div/div[2]/input")).sendKeys("Prerna@gmail.com");
		
		//driver.findElement(By.name("email_create")).sendKeys("aaaaa");
		///driver.findElement(By.cssSelector("input[id=''email_create]")).sendKeys("a@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@id,'email_create')]")).sendKeys("a@gmail.com");
		//driver.close();
		
	}

}
