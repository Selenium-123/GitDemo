import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text= 'Coimbatore (CJB)']")).click();
		//parent-child relationship
		//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@text= 'Coimbatore (CJB)']
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()= ' Goa (GOI)'])[2]")).click();
		//parent-child relationship
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()= ' Goa (GOI)']
		driver.close();
	}

}
