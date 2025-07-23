import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a[class='ui-corner-all']"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				Thread.sleep(2000);
				option.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text= 'Coimbatore (CJB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()= ' Goa (GOI)'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(false);
		}
		else
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1; i<4; i++)
			driver.findElement(By.id("hrefIncAdt")).click();//4 adults
			
			for(int j=0; j<2; j++)
			driver.findElement(By.id("hrefIncChd")).click();//2 child
			
			driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("AED");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.cssSelector("input[name*='FindFlights']")).click();
			
	}

}
