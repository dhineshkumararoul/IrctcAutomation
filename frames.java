package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class  frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 500).perform();
		WebElement b = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
		b.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));
        WebElement middle1	=driver.findElement(By.xpath("//div[@id='content']"));
        System.out.println(middle1.getText());
	}

}
