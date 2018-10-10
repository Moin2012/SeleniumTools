package com.google.radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAMultipleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement multidropdown = driver.findElement(By.id("selenium_commands"));
		Select obj = new Select(multidropdown);
		
		List<WebElement> alloptions = obj.getOptions();
		
		//Size
		System.out.println("Size of multipledropdown  is : "+alloptions.size());
		
		
		//Names
		
		for(WebElement temp : alloptions)  //This is advance for loop
		{
			System.out.println("All selected options : " +temp.getText());
		}

		obj.selectByVisibleText("Browser Commands");
		obj.selectByVisibleText("Switch Commands");
		obj.selectByVisibleText("Wait Commands");
		
		List<WebElement> selectoptn = obj.getAllSelectedOptions();
		
		System.out.println("3 selected options :");
		
		for (WebElement temp1 : selectoptn)
		{
			System.out.println(temp1.getText());
		}
		
		obj.deselectByVisibleText("Wait Commands");
		
		List<WebElement> deselectopt = obj.getAllSelectedOptions();
		
		System.out.println("2 selected options :");
		
		for (WebElement temp1 : deselectopt)
		{
			System.out.println(temp1.getText());
		}
		

	}

}
