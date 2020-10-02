import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("inpu#realbox")).sendKeys("aaaa");
        //driver.findElement(By.xpath("//div[@id='realbox-container']/div/input")).sendKeys("Ind");
	
       // Thread.sleep(3000);
       
       /* List<WebElement> options =driver.findElements(By.cssSelector("//div[@id='realbox-matches'] a"));
        
        for(WebElement option:options) {
        	
        	if(option.getText().equalsIgnoreCase("India")) {
        		
        		option.click();
        		break;
        	}
        }*/
	}

}
