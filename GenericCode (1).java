import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericCode {

	
		// TODO Auto-generated method stub

		public void getRadiosSex(WebDriver driver, String param1, String param2)
		{
			//Radios
			List<WebElement> radios = driver.findElements(By.name(param1));
			System.out.println("Size of Radios :" +radios.size());

			//Names
			for(int i=0;i<radios.size();i++)
			{
				System.out.println(radios.get(i).getAttribute("value"));

			}

			//Data-parameterization

			for(int i=0;i<radios.size();i++)
			{
				if(radios.get(i).getAttribute("value").equals(param2))
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

		}


		public void getCheckboxes(WebDriver driver, String arg1, String arg2)
		{
			//Checkboxes
			List<WebElement> checkboxes = driver.findElements(By.name(arg1));
			System.out.println("Size of Checkboxes :" +checkboxes.size());

			//Names
			for(int i=0;i<checkboxes.size();i++)
			{
				System.out.println(checkboxes.get(i).getAttribute("value"));

			}

			//Data-parameterization

			for(int i=0;i<checkboxes.size();i++)
			{
				if(checkboxes.get(i).getAttribute("value").equals(arg2))
				{
					checkboxes.get(i).click();
				}
			}

			//Either
			for(int i=0;i<checkboxes.size();i++)
			{
				if(checkboxes.get(i).isSelected())
				{
					System.out.println(checkboxes.get(i).getAttribute("value")+ " is  Selected ");
				}
			}


			
		}
		
		public void getDropDown(WebDriver driver, String arg1, String arg2)
		{
			
			WebElement dropdown1= driver.findElement(By.name(arg1));
			
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

			
			obj.selectByVisibleText(arg2);
			
		}


	}


