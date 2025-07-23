import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		//default option
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		//4 adults
		for(int i=1; i<4; i++)
		driver.findElement(By.id("hrefIncAdt")).click();//4 adults
		
		for(int j=0; j<2; j++)
		driver.findElement(By.id("hrefIncChd")).click();//2 child
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//after giving 5 adults and 2 children
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.close();
		
	}

}
