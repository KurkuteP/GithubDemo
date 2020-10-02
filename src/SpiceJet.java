import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       /* Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        s.selectByValue("AED");
        //Thread.sleep(2000);
        s.selectByIndex(1);
        //Thread.sleep(2000);
        s.selectByVisibleText("USD");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       /*Select Adult=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
       Adult.selectByValue("2");
       driver.findElement(By.id("divpaxinfo")).click();
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      // driver.findElement(By.xpath("//a[@value='BHO']")).click();
       Thread.sleep(2000);
       //Here we explicitly tell selenium go and select 2nd node
       //driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
       //when Index are not allowed then use parent child relation xpath
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='CJB']")).click();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
    */
      Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//checkbox is selected or not
		//xpath--> //input[contains(@id,'friendsandfamily')]
		 Assert.assertTrue( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
   
       //Count total number of checkboxes on the page
       System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
       //ctl00_mainContent_chk_friendsandfamily
       driver.findElement(By.id("divpaxinfo")).click();
       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
