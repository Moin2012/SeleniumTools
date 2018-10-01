package PAge2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genericcode {
	
	public void getRadios(WebDriver driver, String param1, String param2)
	{
		// Radios
				List<WebElement> radios = driver.findElements(By.name(param1));
				System.out.println("Size of Radios " + radios.size());

				// NAmes
				for (int i = 0; i < radios.size(); i++) {
					System.out.println(radios.get(i).getAttribute("value"));
				}

				// Data - Parameterization Clicking
				for (int i = 0; i < radios.size(); i++) {
					if (radios.get(i).getAttribute("value").equals(param2)) {
						radios.get(i).click();
					}
				}
				
				//Either
				for (int i = 0; i < radios.size(); i++) {
				if(radios.get(i).isSelected())
				{
					System.out.println(
							radios.get(i).getAttribute("value") + " is Selected!") ;
				}
				}
	}

}
