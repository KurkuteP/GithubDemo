import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Spicee2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
    	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
    	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
    	{
    		System.out.println("It should be disabled");
    		Assert.assertFalse(false);
    	}
    	else
    	{
    		System.out.println("It should be enabled");
    		Assert.assertFalse(true);
    	}
    	
    	Thread.sleep(3000);
    	driver.findElement(By.id("divpaxinfo")).click();
    	//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
    	Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
    	sel.selectByValue("4");
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
    	Select sel2=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
    	sel2.selectByVisibleText("USD");
    	//System.out.println(sel2);
    	Thread.sleep(3000);
    	driver.findElement(By.id("familyandfriend")).click();
    	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        
	}

}
