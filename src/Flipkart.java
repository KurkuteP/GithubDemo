import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.flipkart.com/");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageObject obj=new PageObject(driver);
        obj.Search().sendKeys("iPhone");
        obj.ClickSearch().click();
        WebElement Min= driver.findElement(By.xpath("//div[@class='_1qKb_B']/select"));
        Select M1=new Select(Min);
        M1.selectByValue("2000");
        WebElement Max=driver.findElement(By.xpath("//div[@class='_1YoBfV']/select"));
        Select M2=new Select(Max);
        M2.selectByValue("50000");
        //String str=driver.findElement(By.xpath("//div[@class='_3ULzGw']/ul/li")).getText();
       // System.out.println(str);
       // driver.close();
        // driver.findElement(By.xpath("//section[@class='_1MCcAi D_NGuZ']/div[4]/div/select")).sendKeys("2000");
        //Min.selectByIndex(1);
        //Select Max=new Select(driver.findElement(By.xpath("//*[@class='fPjUPw']")));
       // Max.selectByValue("30000");
        
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone");
		//Direct xpath to search
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Select dropdown = new Select(driver.findElement(By.className("fPjUPw")));
		//dropdown.selectByValue("30000");
		//Traverse through parent to child
		//driver.findElement(By.xpath("//div[@id='container']/div/div/div/div[2]/div[2]/form/div/button")).click();

      //  List<WebElement> bakeries = driver.findElements(By.className(""))
	}

}
