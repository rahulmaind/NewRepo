package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String expectedresult= "Demo Web Shop";
		String actualresult = driver.getTitle();
		if(expectedresult.equals(actualresult)) {
			System.out.println(actualresult);
		    System.out.println("Correct");
		    driver.findElement(By.xpath("//a[@class = 'ico-login']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahulhcl@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
			else {
		    	System.out.println("Incorrect Title");
		    	/*String q=driver.getTitle();
		    	System.out.println(q);*/
		    	//driver.close();	
		    }
	}

}
