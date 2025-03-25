package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cart {

	public static void main(String[] args) throws InterruptedException {

		// Login

		String userName = "rahulshettyacademy";
		String password = "learning";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		driver.findElement(By.xpath("//option[@value='teach']")).click();
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

		// shopping

		List<WebElement> products = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
			if (i == 2) {
				break;
			}

		}

		// Check Out Button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

		// Purchase order

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("in");
		List<WebElement> loaction = driver.findElements(By.xpath("//a[normalize-space()='India']"));
		String expert = "india";
		for (WebElement state : loaction) {
			if (expert.equalsIgnoreCase("india")) {
				state.click();
			}
		}

		// Check Out

		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@aria-label='close']")).isSelected());
		driver.findElement(By.xpath("//a[@aria-label='close']")).getText();
		System.out.println(driver.findElement(By.xpath("//a[@aria-label='close']")).isSelected());

	}

}
