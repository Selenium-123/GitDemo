
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SelIntroduction {

	public static void main(String[] args) {
		
		//Chrome browser
		//below step may or may not be used because selenium manager exists as default to connect to the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nscha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//to close original window invoked by chrome driver in the browser
		driver.close();
	}

}
