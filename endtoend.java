package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class endtoend {

	public static  void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
 	    WebElement data =driver.findElement(By.xpath("//input[@value='option2']"));
        data.click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select newdropdown = new Select(dropdown);
        List<WebElement> option= newdropdown.getOptions();
        
        for(int i=0;i<option.size();i++)
        {
        WebElement values =option.get(i);
        	if(values.getText().equals(data))
        	{
        		System.out.println("equal");
        	}
        	else
        	{
        		System.out.println("Not equal");
        	}
        }
        
		


	}

}  

 

