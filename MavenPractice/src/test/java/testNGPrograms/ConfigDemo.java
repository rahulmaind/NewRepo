package testNGPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfigDemo {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("C:\\eclips\\MavenPractice\\src\\test\\java\\configpropdemo\\config.properties");
	prop.load(ip);
	//To fetch value from config.properties we used "getProperties()"
	System.out.println(prop.getProperty("browser"));
	String browsername= prop.getProperty("browser");
	//To launch multiple browser
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
	driver=new EdgeDriver();
	}
	else {
	System.out.println("Browser not available");
	}
	   driver.manage().window().maximize();
	   driver.get(prop.getProperty("url"));
	   driver.findElement(By.id(prop.getProperty("login_email_id"))).sendKeys(prop.getProperty("email"));
	driver.findElement(By.id(prop.getProperty("login_password_name"))).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath(prop.getProperty("login_loginbtn_xpath"))).click();
	}

	}
