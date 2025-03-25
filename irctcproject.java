package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class irctcproject {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromedriver", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		driver.findElement(By.cssSelector(
				".ng-tns-c57-8.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ui-autocomplete-input.ng-star-inserted"))
				.sendKeys("CHENNAI");
		String expert = "CHENNAI EGMORE - MS(CHENNAI)";
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));
		for (WebElement option1 : options) {
			if (expert.equalsIgnoreCase("CHENNAI EGMORE - MS(CHENNAI)")) {
				option1.click();
				break;

			}
		}

		driver.findElement(By.xpath(
				"//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"))
				.sendKeys("BAN");
		Thread.sleep(2000);
		String act = "BANDRA TERMINUS - BDTS (MUMBAI)";
		List<WebElement> drop = driver.findElements(By.xpath("//li/span[@class='ng-star-inserted']"));
		for (WebElement drop1 : drop) {
			if (act.equalsIgnoreCase("BANDRA TERMINUS - BDTS (MUMBAI)")) {
				drop1.click();
				break;
			}
		}

		driver.findElement(By
				.xpath("//span[@class='ng-tns-c65-12 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"))
				.click();
		driver.findElement(By.xpath("//li[@aria-label='LADIES']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Flexible With Date']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Train with Available Berth']")).click();
		driver.findElement(By.xpath(
				"//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
		driver.findElement(By
				.xpath("//span[@class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"))
				.click();
		driver.findElement(By.xpath("//span[normalize-space()='Vistadome AC (EV)']")).click();
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[@class='ng-tns-c83-32']//label[@for='2A'][normalize-space()='AC 2 Tier (2A)']")).click();
		driver.findElement(By.xpath("//table[@class='ng-tns-c83-33']//label[@for='O']")).click();
		driver.findElement(By.xpath("//label[@for='SP']")).click();
		driver.findElement(By.xpath("//label[@for='ST']")).click();
		
		driver.findElement(By.xpath("//table[@class='ng-tns-c83-33']//label[@for='O']")).click();
	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='ng-tns-c83-33']//label[@for='O']")));  
		

	}

}
