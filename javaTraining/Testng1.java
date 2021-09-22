package javaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.id("divPassword")).sendKeys("admin123 ");
		driver.findElement(By.id("btnLogin")).click();*/
		
		//driver.get("https://demoqa.com/buttons");
		//driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		/*String str= driver.findElement(By.id("qERob")).getAttribute("id");
		driver.findElement(By.id(str)).click();*/
		
		
		/*WebElement element=driver.findElement(By.id("doubleClickBtn"));	
		Actions act=new Actions(driver);
		act.moveToElement(element).doubleClick().build().perform();*/
		
		
		/*WebElement element=driver.findElement(By.id("doubleClickBtn"));	
		Actions act=new Actions(driver);
		act.moveToElement(element).contextClick().build().perform();*/
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.id("userName")).sendKeys("Prajakta");
		driver.findElement(By.id("item-1")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
