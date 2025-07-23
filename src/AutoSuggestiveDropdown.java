import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a[class='ui-corner-all']"));
		List<String> list = new ArrayList<String>();
		for(WebElement e:options)
		{
			list.add(e.getText());
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("Australia"))
			{
				Thread.sleep(2000);
				option.click();
				break;
			}
		}
		driver.close();
	}

}
