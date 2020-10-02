import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	WebDriver driver;
public PageObject(WebDriver driver) {

this.driver=driver;

	}


By search= By.xpath("//*[@name='q']");
By clickSearch=By.xpath("//*[@type='submit']");




public WebElement Search()
{
	return driver.findElement(search);
}
public WebElement ClickSearch()
{
	return driver.findElement(clickSearch);
}


}
