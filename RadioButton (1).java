package com.google.radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
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

		
		//Radios
		List<WebElement> radios = driver.findElements(By.name("tripType"));
		System.out.println("Size of Radios :" +radios.size());
		
		//Names
		for(int i=0;i<radios.size();i++)
		{
			System.out.println(radios.get(i).getAttribute("value"));
			
		}
		
		//Data-parameterization
		
		for(int i=0;i<radios.size();i++)
		{
			if(radios.get(i).getAttribute("value").equals("oneway"))
			{
				radios.get(i).click();
			}
		}
		
		//Either
		for(int i=0;i<radios.size();i++)
		{
			if(radios.get(i).isSelected())
			{
				System.out.println(radios.get(i).getAttribute("value")+ " is  Selected ");
			}
		}
		
		GenericRadioButton r = new GenericRadioButton();
		r.getRadios(driver, "servClass", "Business");
		
		
		}

}
