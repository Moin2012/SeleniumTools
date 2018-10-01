package PAge2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Desktop\\Seleniumsoftware\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");

		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();

		Genericcode obj = new Genericcode();
		obj.getRadios(driver, "tripType", "oneway");
		obj.getRadios(driver, "servClass", "Business");

	}

}
