import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter username:");
		String userName = s.next();
		// String password = "rahulshettyacademy";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nscha\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\nscha\\Documents\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\nscha\\Documents\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		Locators2 ob = new Locators2();
		String password = ob.getPassword(driver);
		// driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String loggedIn = driver.findElement(By.tagName("p")).getText();
		System.out.println(loggedIn);
		Assert.assertEquals(loggedIn, "You are successfully logged in.");
		String greeting = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(greeting);
		Assert.assertEquals(greeting, "Hello " + userName + ",");
		s.close();
		//driver.close();
	}

	public String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String getPassword = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = getPassword.split("'");
		// passwordArray[0] = Please use temporary password
		// passWordArray[1] = rahulshettyacademy' to Login.
		String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0] = rahulshettyacademy
		// passwordArray2[1] = to Login.
		String password = passwordArray2[0];
		return password;
	}

}
