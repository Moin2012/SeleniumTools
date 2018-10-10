package com.google.radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("No. of Links : "+alllinks.size());
		
		for(int i=0;i<alllinks.size();i++)
		{
			System.out.println(alllinks.get(i).getText()+"|"+alllinks.get(i).getAttribute("href"));
			
			if(alllinks.get(i).getAttribute("href").contains(""))
		}
		
		

	}

}
