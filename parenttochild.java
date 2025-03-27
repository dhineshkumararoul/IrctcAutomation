package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class parenttochild {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 500).perform();
		WebElement a1 = driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']"));
		a1.click();
		WebElement b = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		b.click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		WebElement c = driver.findElement(By.xpath("//h3[normalize-space()='New Window']"));
		System.out.println(c.getText());
		driver.switchTo().window(parentid);
		System.out.println(b.getText());

	}

}
