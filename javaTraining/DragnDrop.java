package javaTraining;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop 

{
	
	 public static void main(String[] args) throws InterruptedException, IOException {
	        // TODO Auto-generated method stub

	 

	        //System.setProperty("webdriver.chrome.driver", "F:\\Selenium Resources\\chromedriver_win32\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	                
	        driver.manage().window().maximize();
	        driver.get("https://jqueryui.com/droppable/");
	        WebElement ele=driver.findElement(By.className("demo-frame"));
	        driver.switchTo().frame(ele);
}  
}	


