import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Prerna");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'companyname')]")).sendKeys("TCS");
		driver.findElement(By.cssSelector("input[id='inputPhone']")).sendKeys("1212121");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("thane");
		driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("Mumbai");
        driver.findElement(By.name("city")).sendKeys("Pune");
    	driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
    	driver.findElement(By.cssSelector("input[name='postcode']")).sendKeys("412306");
    	driver.close();
    	//Method m=new Method();
    	//m.validate();
    	
	
	
		//driver.findElement(By.cssSelector("a[target*='_blank']")).click();
		//driver.findElement(By.linkText("Log in")).click();
	}

}
