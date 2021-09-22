package javaTraining;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
