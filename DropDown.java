package com.google.radio;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement editboxname = driver.findElement(By.name("userName"));
		editboxname.sendKeys("batman");
		
		WebElement editboxpassword = driver.findElement(By.name("password"));
		editboxpassword.sendKeys("batman");
		
		WebElement signin = driver.findElement(By.name("login"));
		signin.click();
		
		//dropdown
		
		WebElement dropdown1= driver.findElement(By.name("fromMonth"));
		
		Select obj = new Select(dropdown1);
		
		java.util.List<WebElement> list = obj.getOptions();

		//Size
		System.out.println("Size of Dropdown is : "+list.size());
		
		
		//Names
		
		for(int i=0;i<list.size();i++)  //This is normal for loop
		{
			System.out.println(list.get(i).getText());
		}
		
		for(WebElement temp : list)  //This is advanced for loop
		{
			System.out.println(temp.getText());
		}

		
		obj.selectByIndex(6);
		Thread.sleep(3000);
		obj.selectByValue("12");
		Thread.sleep(3000);
		obj.selectByVisibleText("August");
		Thread.sleep(3000);
	}

}
