import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericCodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Pooja");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Korde");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement editboxname = driver.findElement(By.name("userName"));
		editboxname.sendKeys("batman");
		
		WebElement editboxpassword = driver.findElement(By.name("password"));
		editboxpassword.sendKeys("batman");
		
		WebElement signin = driver.findElement(By.name("login"));
		signin.click();
		
		GenericCode g = new GenericCode();
		/*g.getRadiosSex(driver, "sex", "Female");
		g.getRadiosSex(driver, "exp", "2");
		g.getCheckboxes(driver, "profession", "Manual Tester");
		g.getCheckboxes(driver, "tool", "Selenium Webdriver");*/
		g.getDropDown(driver, "fromMonth", "September");
		
		

	}

}
